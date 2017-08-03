package com.day.demo;

public class Penguin {

	private String name = "无名氏";
	private int heanth = 100;
	private int love = 0;
	static final String SEX_MALE = "Q仔";
	static final String SEX_FEMALE = "Q妹";
	private String sex = "";
	boolean con = true;

	public Penguin() {

	}

	public Penguin(String name, int heanth, int love, String sex) {
		super();
		this.name = name;
		this.heanth = heanth;
		this.love = love;
		this.sex = sex;
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
		if(heanth<0||heanth>100){
			System.out.println("您输入的健康值有误，默认值是"+getHeanth()+"\n");
			con =false;			
		}else{
			con=true;
		this.heanth = heanth;
		}
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		if(love<0||love>100){
			System.out.println("\n"+"您输入的爱心值有误，默认值是"+getLove()+"\n");
			con=false;
		}else{
			con=true;
		this.love = love;
		}
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void print() {
		System.out.println("宠物的自白：");
		System.out.println("我的名字叫" + this.getName() + "，健康值是" + this.getHeanth() + "，和主人的亲密度是" + this.getLove()
				+ "，我是一只" + this.getSex());
	}

}