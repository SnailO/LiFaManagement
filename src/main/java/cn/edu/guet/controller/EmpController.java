package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.dt.EmpDto;
import cn.edu.guet.model.Emp;
import cn.edu.guet.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("emp")
public class EmpController {

    @Autowired
    IEmpService empService;

    @RequestMapping("chooseEmp")
    @ResponseBody
    public Result chooseEmp(@RequestBody EmpDto empDto){

        Emp emp = empService.chooseEmp(empDto.getEmpLevel());
        return Result.succ(emp);
    }
}
