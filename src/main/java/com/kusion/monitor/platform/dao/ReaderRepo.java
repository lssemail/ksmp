package com.kusion.monitor.platform.dao;

import com.kusion.monitor.platform.model.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by shuai on 2017/6/23.
 */
@Repository
public interface ReaderRepo extends JpaRepository<Reader, String>{

}
