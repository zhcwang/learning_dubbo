package com.learning.dubbo.demo.consumer;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @Auther wang.zhc
 * @Date 2019/10/18 17:01
 * @Description
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Main.class).web(WebApplicationType.SERVLET).run(args);
    }
}
