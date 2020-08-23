package cn.edu.guet.service;

import cn.edu.guet.model.Vip;

public interface IVipService {
    Vip getVipByTel(String phone);
    Vip getVipId(String phone);
}
