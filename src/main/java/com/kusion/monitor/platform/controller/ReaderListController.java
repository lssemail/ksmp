package com.kusion.monitor.platform.controller;

import com.kusion.monitor.platform.dao.ReaderListRepo;
import com.kusion.monitor.platform.model.AmazonProperties;
import com.kusion.monitor.platform.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by shuai on 2017/6/23.
 */
@Controller
@RequestMapping("/reader")
//@ConfigurationProperties(prefix = "amazon")
public class ReaderListController {

    private String associateId;

    @Autowired
    private ReaderListRepo readerListRepo;

    @Autowired
    private AmazonProperties amazonProperties;

    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    public String readerBooks(@PathVariable("reader") String rereader,
                              Model model){
        List<Book> readList = readerListRepo.findByReader(rereader);
        if(readList != null && !readList.isEmpty()){
            model.addAttribute("books", readList);
            //model.addAttribute("amazonID", associateId);
            model.addAttribute("amazonID", amazonProperties.getAssociateId());
        }
        return "readingList";
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader") String rereader,
                                   Book book){
        book.setReader(rereader);
        readerListRepo.save(book);
        return "redirect:/reader/{reader}";

    }

    public void setAssociateId(String associateId){
        this.associateId = associateId;
    }
}
