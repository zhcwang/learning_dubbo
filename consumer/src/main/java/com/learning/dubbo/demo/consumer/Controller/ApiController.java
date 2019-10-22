package com.learning.dubbo.demo.consumer.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.learning.dubbo.demo.api.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther wang.zhc
 * @Date 2019/10/18 17:02
 * @Description
 */
@RestController
public class ApiController {

    @Reference(
            version = "${api.service.version}",
            application = "${dubbo.application.id}",
            registry = "${dubbo.registry.id}"
    )
    private Api api;

    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable String name){
        return api.sayHello(name);
    }

    @GetMapping("goodbye/{name}")
    public String sayGoodbye(@PathVariable String name){
        return api.sayGoodbye(name);
    }

}
