package com.learning.dubbo.demo.provider.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.learning.dubbo.demo.api.Api;

/**
 * @Auther wang.zhc
 * @Date 2019/10/18 16:47
 * @Description
 */
@Service(
        version = "${api.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class ApiService implements Api {

    @Override
    public String sayHello(String name) {
        return "Hello "+name+" !";
    }

    @Override
    public String sayGoodbye(String name) {
        return "Goodbye "+name+" !";
    }
}
