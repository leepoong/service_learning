package com.tencent.lp.service_learning.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HystrixService {
    private Logger logger = LoggerFactory.getLogger(HystrixService.class);

    @HystrixCommand(commandKey = "testCommand", groupKey = "testGroup", fallbackMethod = "timeOut", commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")})
    public void run() {
        logger.info("start to sleep ...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("end of sleeping ...");
    }

    public void timeOut() {
        logger.info("timeOut method execute ...");
    }
}
