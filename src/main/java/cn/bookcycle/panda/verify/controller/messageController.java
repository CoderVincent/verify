package cn.bookcycle.panda.verify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class messageController {
    @RequestMapping(value = "/login")
    public String verifycode(){
        return "verify";
    }

    @RequestMapping(value = "/loginsuccess")
    public String success(){
        return "success";
    }
}
