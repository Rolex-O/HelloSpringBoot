package com.makotojava.learn.hellospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称：HelloSpringBoot
 * 包路径：com.makotojava.learn.hellospringboot
 *
 * @author zf
 * @version 2.0.0
 * @ClassName HelloRestController.java
 * @Description TODO
 * @createTime 2019年06月20日 12:52:00
 */
@RestController
public class HelloRestController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello. All your base are belong to us.";
    }
}
