package com.kusion.monitor.platform.service.business;

import com.kusion.monitor.platform.dao.BusinessRepo;
import com.kusion.monitor.platform.model.business.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/16.
 */
@Service
public class BusinessService {

    @Autowired
    BusinessRepo businessRepo;

    public Business insert(Business business){

        businessRepo.save(business);

        return business;
    }

    List<Business> listAll(){

        return businessRepo.findAll();
    }


}
