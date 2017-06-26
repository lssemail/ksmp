package com.kusion.monitor.platform.dao;

import com.kusion.monitor.platform.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shuai on 2017/6/23.
 */
@Repository
public interface ReaderListRepo extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader);
}
