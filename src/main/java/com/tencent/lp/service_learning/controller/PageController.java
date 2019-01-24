package com.tencent.lp.service_learning.controller;

import com.tencent.lp.service_learning.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PageController {
    private Logger logger = LoggerFactory.getLogger(PageController.class);

    @RequestMapping("/search")
    public String index() {
        logger.info("hello {}", "world");
        return "search";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

}
