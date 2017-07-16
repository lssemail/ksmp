package com.kusion.monitor.platform.dao;

import com.kusion.monitor.platform.model.business.Business;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/7/16.
 */
public interface BusinessRepo extends JpaRepository<Business, Long> {
}
