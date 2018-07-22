package com.web;

import com.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: seababy
 * Time: 2018/7/22 10:55
 * Description:
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;
    @RequestMapping("/hello")
    public void sayHello(){
        System.out.println(helloService.sayHello("wangal"));
    }
}
