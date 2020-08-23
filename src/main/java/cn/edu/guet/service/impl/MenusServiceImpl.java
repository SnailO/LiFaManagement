package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.MenusMapper;
import cn.edu.guet.model.Menus;
import cn.edu.guet.service.IMenusService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MenusServiceImpl implements IMenusService {

    @Autowired
    MenusMapper menusMapper;

    @Override
    public List<Menus> getAllMenus() {
        return menusMapper.getAllMenus();
    }
}
