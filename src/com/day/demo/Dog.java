package com.day.demo;

public class Dog {
	private String name = "无名氏";
	private int heanth = 60;
	private int love = 0;
	private String clazz = "二哈";
	boolean con = true;

	public Dog() {

	}

	public Dog(String name, int heanth, int love, String clazz) {
		this.name = name;
		this.heanth = heanth;
		this.love = love;
		this.clazz = clazz;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeanth() {
		return heanth;
	}

	public void setHeanth(int heanth) {

		if (heanth < 0 || heanth > 100) {
			System.out.println("健康值应该在（0~100）之间，默认值是" + getHeanth());
			con = false;
		} else {
			con =true;
			this.heanth = heanth;
		}
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public void print() {
		System.out.println("宠物的自白：");
		System.out.println("我的名字叫" + this.getName() + "，健康值是" + this.getHeanth() + "，和主人的亲密度是" + this.getLove()
				+ "，我是一只" + this.getClazz());
	}
}
