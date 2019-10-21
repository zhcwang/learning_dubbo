package com.learning.dubbo.demo.provider;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @Auther wang.zhc
 * @Date 2019/10/18 16:44
 * @Description
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Main.class).web(WebApplicationType.NONE).run(args);
    }
}

