package com.sankai.st.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sankai.st.dto.GenStructFileDto;
import com.sankai.st.factory.CommonGeneratorFactory;

/**
 * @author sankai
 * @since 2023-06-06 23:06:43
 */
@RestController
public class TestController {
    @Autowired
    private CommonGeneratorFactory commonGeneratorFactory;
    @RequestMapping("/test")
    public Object test() {
        commonGeneratorFactory.doGen("mysqlParseImpl", "javaFileGeneratorImpl");
        return "success";
    }
}
