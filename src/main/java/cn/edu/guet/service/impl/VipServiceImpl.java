package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.VipMapper;
import cn.edu.guet.model.Vip;
import cn.edu.guet.service.IVipService;
import org.springframework.beans.factory.annotation.Autowired;

public class VipServiceImpl implements IVipService {

    @Autowired
    VipMapper vipMapper;

    @Override
    public Vip getVipByTel(String phone) {
        return vipMapper.getVipByTel(phone);
    }

    @Override
    public Vip getVipId(String phone) {
        return vipMapper.getVipId(phone);
    }
}
