package cn.edu.guet.model;

import java.util.ArrayList;
import java.util.List;

public class Menus {
    private String menuId;
    private String menuName;
    private String pId;
    private String url;
    private String icon;
    private List<Menus> childMenus=new ArrayList<Menus>();


    public List<Menus> getChildMenus() {
        return childMenus;
    }

    public void setChildMenus(List<Menus> childMenus) {
        this.childMenus = childMenus;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
