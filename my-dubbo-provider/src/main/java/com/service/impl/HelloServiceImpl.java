package com.service.impl;

import com.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * User: seababy
 * Time: 2018/7/22 10:22
 * Description:
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello(String name) {
        return name;
    }
}
