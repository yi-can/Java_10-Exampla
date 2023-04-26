package com.bildeadam.lesson001;

public class Question1 {

	int sayi = 0;//ctrl+alt+aşağı tuşu aynı satısı aşağı doğru kopyalar
	
	public static void main(String[] args) {
		
		int urFiyat = 100;
		
		double kar = urFiyat-(urFiyat/100)*15;
		double a = kar-(kar/100)*18;
		
		System.out.println("Kar'siz fiyatı : " + kar);
		System.out.println("KDV'siz fiyatı : " + a);
	}
}
