package cn.bookcycle.panda.verify.controller;

import cn.bookcycle.panda.verify.constant.AppConstant;
import com.github.qcloudsms.SmsVoiceVerifyCodeSender;
import com.github.qcloudsms.SmsVoiceVerifyCodeSenderResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class phoneController {
//     @RequestMapping(value = "/message/phoneVerify",method = RequestMethod.POST)
//     public String phoneVerify(@RequestParam("verifyCode") String verifyCode,
//                               @RequestParam("phoneNumber") String phoneNumber) throws Exception{
//         SmsVoiceVerifyCodeSender smsVoiceVerifyCodeSender = new SmsVoiceVerifyCodeSender(AppConstant.appid,AppConstant.appkey);
//         SmsVoiceVerifyCodeSenderResult result = null;
//         result = smsVoiceVerifyCodeSender.send("86",phoneNumber,verifyCode,2,"");

//         System.out.println(result);
//         return result.toString();
//     }
  
    @RequestMapping("/helloAAA")
    public String helloAAA(){
      return "ss"
    }
}
