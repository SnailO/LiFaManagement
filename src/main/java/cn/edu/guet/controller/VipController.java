package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.dt.VipDto;
import cn.edu.guet.model.Vip;
import cn.edu.guet.service.IVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("vip")
public class VipController {

    @Autowired
    IVipService vipService;

    @RequestMapping(value = "getVipByTel",method = {RequestMethod.GET})
    @ResponseBody
    public Result getVipByTel(String phone){
        Vip vip = vipService.getVipByTel(phone);
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+vip);
        if(vip!=null){
            return Result.succ(vip);
        }else{
            return Result.fail("请求失败");
        }
    }
}
