package cn.bookcycle.panda.verify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class messageController {
    @RequestMapping(value = "/login")
    public String verifycode(){
        return "test1";
    }

    @RequestMapping(value = "/loginsuccess")
    public String success(){
        return "success";
    }
}
