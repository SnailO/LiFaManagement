package cn.edu.guet.service;

import cn.edu.guet.model.Emp;

public interface IEmpService {
    Emp chooseEmp(String empLevel);
    Emp getEmpId(String empName);
}
