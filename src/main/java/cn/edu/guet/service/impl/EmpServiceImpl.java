package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.EmpMapper;
import cn.edu.guet.model.Emp;
import cn.edu.guet.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmpServiceImpl implements IEmpService {

    @Autowired
    EmpMapper empMapper;

    @Override
    public Emp chooseEmp(String empLevel) {
        return empMapper.chooseEmp(empLevel);
    }

    @Override
    public Emp getEmpId(String empName) {
        return empMapper.getEmpId(empName);
    }
}
