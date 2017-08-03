package com.day.demo;

import java.util.Scanner;import org.omg.Messaging.SyncScopeHelper;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Penguin penguin = new Penguin();
		boolean con =true ;
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎您来到宠物店！");
		System.out.print("请输入您想要领养的宠物的名字:");
		String name = input.next();
		do{
			con =true;
		System.out.print("请输入您想要领养的宠物的类型的编号（1，狗狗  2，企鹅）:");
		 num = input.nextInt();
		 if(num!=1&&num!=2){
			 System.out.println("非常抱歉，领养的宠物的类型的编号不存在，请重新选择！");
			 con=false;
		 }
		}while(con==false);
		switch (num) {
		case 1:
			do{
				
			System.out.print("请输入狗狗的品种的数字（1，聪明的拉布拉多犬    2，酷酷的雪娜瑞）：");
			int num1 = input.nextInt();
			if (num1 == 1) {
				dog.setClazz("聪明的拉布拉多犬");
			} else if (num1 == 2) {
				dog.setClazz("酷酷的雪娜瑞");
			} else {
				System.out.println("请输入正确的狗狗的数字编号！！");
				con=false;
			}
			}while(con==false);

			do {
				System.out.print("请输入狗狗的健康值（1~100之间）：");
				int numhealth = input.nextInt();
				dog.setHeanth(numhealth);
			} while (dog.con == false);
			

			dog.setName(name);
			dog.print();

		case 2:
							
			do{
				System.out.print("请选择企鹅的性别：（1，Q仔  2，Q妹）：");
				num =input.nextInt();
				con=true;
			if(num==1){
				penguin.setSex(Penguin.SEX_MALE);
			}else if(num==2){
				penguin.setSex(Penguin.SEX_FEMALE);
			}else{
				System.out.println("\n"+"请输入正确的萌宠的性别编号！"+"\n");
				con=false;
			}
			}while(con==false);
			penguin.setName(name);
			do{				
			System.out.print("请输入"+penguin.getName()+"的健康值（1~100之间）：");
			int numhealth = input.nextInt();
			penguin.setHeanth(numhealth);			
			}while(penguin.con==false);
			do{
			System.out.print("请输入"+penguin.getName()+"的爱心值初始（1~100之间）：");
			int numLove = input.nextInt();
			penguin.setLove(numLove);
			}while(penguin.con==false);			
			penguin.print();
		}
	}

}
