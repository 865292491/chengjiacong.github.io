package xyz.chengjiacong.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: ChengJiacong
 */
@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
