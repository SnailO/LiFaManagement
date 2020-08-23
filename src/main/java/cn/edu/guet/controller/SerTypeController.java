package cn.edu.guet.controller;

import cn.edu.guet.model.Sertp;
import cn.edu.guet.service.ISerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("showType")
public class SerTypeController {

    @Autowired
    ISerTypeService serTypeService;

    @RequestMapping(value = "showAllType",method = {RequestMethod.POST})
    @ResponseBody
    public List<Sertp> showAllSerTpye(){
        List<Sertp> sertps = serTypeService.showAllSerTpye();
        return sertps;
    }
}
