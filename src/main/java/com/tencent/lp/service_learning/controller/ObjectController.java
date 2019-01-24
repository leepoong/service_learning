package com.tencent.lp.service_learning.controller;

import com.tencent.lp.service_learning.entity.Req;
import com.tencent.lp.service_learning.entity.Rsp;
import com.tencent.lp.service_learning.entity.RspData;
import com.tencent.lp.service_learning.entity.Student;
import com.tencent.lp.service_learning.service.HystrixService;
import com.tencent.lp.service_learning.service.StudentServiceImp1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ObjectController {
    @Autowired
    private StudentServiceImp1 service;

    @Autowired
    private HystrixService hystrixService;

    @RequestMapping("/req1")
    public void run2() {
        hystrixService.run();
    }

    @RequestMapping(value = "/ajax", method = RequestMethod.GET)
    public Object ajax(long beginTime, long endTime, Model model) {
        System.out.println("beginTime:  " + beginTime);
        System.out.println("endTime:    " + endTime);
        return new Req();
    }

    @RequestMapping("/test2")
    public Object run() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "zhangsan", 23, "male"));
        list.add(new Student(2, "lisi", 32, "female"));
        list.add(new Student(3, "wangerma", 43, "male"));
        return list;
    }

    @RequestMapping("/simulate")
    public Object run2(@RequestBody Req req) {
        System.out.println(req);
        Rsp rsp = new Rsp();
        rsp.setErrCode(0);
        rsp.setErrMsg("success");
        List<RspData> list = new ArrayList<>();
        List<String> ip1 = new ArrayList<>();
        List<String> ip2 = new ArrayList<>();
        ip2.add("100.115.135.150");
        ip1.add("100.115.159.200");
        ip1.add("100.115.135.149");
        Map<Long, Map<String, Float>> map = new HashMap<>();
        Map<String, Float> v1 = new HashMap<>();
        v1.put("accusation_cnt", 1.0f);
        v1.put("article_click", 1.0f);
        v1.put("biu_cnt", 1.0f);
        v1.put("comment_cnt", 1.0f);
        v1.put("exp_cnt", 1.0f);
        v1.put("feeds_click", 1.0f);
        v1.put("feeds_expose", 1.0f);
        v1.put("praise_cnt", 1.0f);
        v1.put("pv", 2.0f);
        v1.put("reading_cnt", 1.0f);
        v1.put("reading_rate", 1.0f);
        v1.put("reading_rate_count", 1.0f);
        v1.put("reading_tm", 1.0f);
        v1.put("share_cnt", 1.0f);
        Map<String, Float> v2 = new HashMap<>();
        v2.put("accusation_cnt", 1.0f);
        v2.put("article_click", 1.0f);
        v2.put("biu_cnt", 1.0f);
        v2.put("comment_cnt", 1.0f);
        v2.put("exp_cnt", 1.0f);
        v2.put("feeds_click", 1.0f);
        v2.put("feeds_expose", 1.0f);
        v2.put("praise_cnt", 1.0f);
        v2.put("pv", 4.0f);
        v2.put("reading_cnt", 1.0f);
        v2.put("reading_rate", 1.0f);
        v2.put("reading_rate_count", 1.0f);
        v2.put("reading_tm", 1.0f);
        v2.put("share_cnt", 1.0f);
        map.put(1L, v1);
        map.put(3L, v2);
        Map<Long, Map<String, Float>> map2 = new HashMap<>();
        RspData data1 = new RspData("3735c34788326959", ip1, map);
        for (int i = 0; i < 100; i++) {
            list.add(data1);
        }
        RspData data2 = new RspData("6235c3453e056152", ip2, map2);
        list.add(data2);
        rsp.setData(list);
        return rsp;
//        throw new RuntimeException();
    }

}
