package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.SerTpyeMapper;
import cn.edu.guet.model.Sertp;
import cn.edu.guet.service.ISerTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class SerTypeServiceImpl implements ISerTypeService {

    @Autowired
    SerTpyeMapper serTpyeMapper;

    @Override
    public List<Sertp> showAllSerTpye() {
        return serTpyeMapper.showAllSerTpye();
    }

    @Override
    public Sertp getServiceId(String serviceName) {
        return serTpyeMapper.getServiceId(serviceName);
    }
}
