package com.kusion.monitor.platform.service;

import com.kusion.monitor.platform.dao.JdbcTemplateCondition;
import org.springframework.context.annotation.Conditional;

/**
 * Created by shuai on 2017/6/23.
 */
@Conditional(JdbcTemplateCondition.class)
public class ReaderListService {


}
