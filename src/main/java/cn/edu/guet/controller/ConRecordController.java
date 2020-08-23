package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.mapper.VipMapper;
import cn.edu.guet.model.ConRecord;
import cn.edu.guet.service.IConRecordService;
import cn.edu.guet.service.IVipService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;

@Controller
@RequestMapping("record")
public class ConRecordController {

    @Autowired
    IConRecordService conRecordService;

    @Autowired
    IVipService vipService;

    @RequestMapping("addRecord")
    @ResponseBody
    public Result insertRecord(ConRecord conRecord) {
        try {
            conRecordService.insertRecord(conRecord);
            return Result.succ(conRecord);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("添加失败");
        }
    }
}
