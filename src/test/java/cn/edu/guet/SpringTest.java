package cn.edu.guet;
import cn.edu.guet.model.ConRecord;
import cn.edu.guet.model.Emp;
import cn.edu.guet.model.Sertp;
import cn.edu.guet.service.IConRecordService;
import cn.edu.guet.service.IEmpService;
import cn.edu.guet.service.ISerTypeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")
public class SpringTest {

    @Autowired
    ISerTypeService serTypeService;

    @Autowired
    IEmpService empService;

    @Autowired
    IConRecordService conRecordService;

    @Test
    public void testShowAllSerType() {
        List<Sertp> sertps = serTypeService.showAllSerTpye();
        for(Sertp sertp:sertps){
            System.out.println("编号："+sertp.getServiceId());
            System.out.println("类型名："+sertp.getServiceName());
            System.out.println("售价："+sertp.getPrice());
        }
    }

    @Test
    public void testChooseEmp(){
        Emp emp = empService.chooseEmp("中工");
        System.out.println(emp.getEmpId());
        System.out.println(emp.getEmpName());
    }

    @Test
    public void testInsertRecord(){

    }
}