package com.rui.pro1.modules.sys.bean;

import java.util.List;

/**
 * 例子，.....
 * 
 */

public class RoleBean {

	private int id;

	private String name;

	private String remake;

	private Integer status;

	private List<MenuBean> menus; // 拥有的菜单列表

	public RoleBean() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<MenuBean> getMenus() {
		return menus;
	}

	public void setMenus(List<MenuBean> menus) {
		this.menus = menus;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemake() {
		return this.remake;
	}

	public void setRemake(String remake) {
		this.remake = remake;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}