package cn.bookcycle.panda.verify.controller;

import cn.bookcycle.panda.verify.constant.AppConstant;
import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class testController {

    @RequestMapping(value = "/message",method = RequestMethod.POST)
    public String test(@RequestParam(value = "verifyCode") Integer verifyCode,
                        @RequestParam(value = "phoneNumber") String phoneNumber){
        SmsSingleSenderResult result = new SmsSingleSenderResult();
        try{
            SmsSingleSender sender=new SmsSingleSender(AppConstant.appid,AppConstant.appkey);
            String[] params = {verifyCode.toString()};
            result = sender.sendWithParam("86",phoneNumber, AppConstant.templateId,params,"","","");
            System.out.print(result);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }
}
