package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {
	public static void main(String[] args) {
//		원화를 달러화로 계산하는 프로그램을 작성하세요 환율 1달러 = 1230.95원 상수로 지정
		Scanner sc = new Scanner(System.in);
		final double exchangeRate = 1230.95;
		double won;
		double dallar;
		
		System.out.print("환전할 원화를 입력하세요 : ");
		won = sc.nextDouble();
		dallar = won / exchangeRate;
		System.out.print("받으실 달러는 : " + dallar + "달러입니다.");
		
		sc.close();
	}
}
