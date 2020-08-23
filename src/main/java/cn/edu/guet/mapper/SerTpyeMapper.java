package cn.edu.guet.mapper;

import cn.edu.guet.model.Sertp;

import java.util.List;


public interface SerTpyeMapper {
    List<Sertp> showAllSerTpye();
    Sertp getServiceId(String serviceName);
}
