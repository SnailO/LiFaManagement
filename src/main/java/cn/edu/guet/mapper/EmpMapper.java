package cn.edu.guet.mapper;

import cn.edu.guet.model.Emp;

public interface EmpMapper {
    Emp chooseEmp(String empLevel);
    Emp getEmpId(String empName);
}
