package cn.edu.guet.mapper;

import cn.edu.guet.model.Vip;

public interface VipMapper {
    Vip getVipByTel(String phone);//通过电话号码获取会员的全部信息
    Vip getVipId(String phone);//通过电话号码获取id
}
