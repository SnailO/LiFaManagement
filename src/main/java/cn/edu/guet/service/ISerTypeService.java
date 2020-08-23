package cn.edu.guet.service;

import cn.edu.guet.model.Sertp;

import java.util.List;


public interface ISerTypeService {
    List<Sertp> showAllSerTpye();
    Sertp getServiceId(String serviceName);
}
