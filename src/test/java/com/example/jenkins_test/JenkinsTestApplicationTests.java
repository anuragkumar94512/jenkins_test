package com.example.jenkins_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTestApplicationTests {
    private Logger logger= LoggerFactory.getLogger(JenkinsTestApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Application Test Executed !");
        Assertions.assertEquals(true ,true);
    }

}
