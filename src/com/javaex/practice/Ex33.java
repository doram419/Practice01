package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {
	public static void main(String[] args) {
		//사용자로부터 구의 반지름을 입력 받아 구의 부피를 계산하는 프로그램을 작성하세요
		double radius;
		double volume;
		final double PI = 3.14;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 : ");
		radius = sc.nextDouble();
		
		volume = radius * radius * radius * PI * 4 / 3;
		System.out.println("구의 부피는 : " + volume + "입니다.");
		
		sc.close();
	}
}
