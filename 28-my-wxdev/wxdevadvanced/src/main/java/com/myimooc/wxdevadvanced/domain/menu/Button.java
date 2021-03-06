package com.myimooc.wxdevadvanced.domain.menu;

/**
 * 菜单按钮
 * @author ZhangCheng on 2017-08-12
 *
 */
public class Button {
	private String type;
	private String name;
	private Button[] sub_button;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Button[] getSub_button() {
		return sub_button;
	}
	public void setSub_button(Button[] sub_button) {
		this.sub_button = sub_button;
	}
}
