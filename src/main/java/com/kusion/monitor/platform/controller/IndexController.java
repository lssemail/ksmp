package com.kusion.monitor.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shuai on 2017/6/22.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/page/{file}")
    public String page(@PathVariable String file){

        return "/page/" + file;
    }

    @RequestMapping("/page/{folder}/{file}")
    public String page(@PathVariable String folder, @PathVariable String file){

        return "/page/" + folder + "/" + file;
    }
}
