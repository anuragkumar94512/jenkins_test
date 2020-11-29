package com.example.jenkins_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsTestApplication {
    private static  Logger logger= LoggerFactory.getLogger(JenkinsTestApplication.class);

    @PostConstruct
    public void demo(){
        logger.info("Application Start....");
    }
    public static void main(String[] args)
    {
        logger.info("Application Executed !");
        SpringApplication.run(JenkinsTestApplication.class, args);
    }

}
