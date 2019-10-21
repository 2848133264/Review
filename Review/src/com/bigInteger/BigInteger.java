package com.bigInteger;

public class BigInteger {
	long i =Integer.MAX_VALUE;
	//2147483647   
	//21474836470
	//4611686014132420609
	//4611686024869838847
	//1.98070406562362E28
	//使用long不就能达到百亿的效果么
	//21亿。
	public static void main(String[] args) {
		
		BigInteger b =new BigInteger();
		System.out.println(b.i*b.i*b.i*(Math.pow(2, 32)));
		
		int a[] = new int[10];
		System.out.println(a[1]);//0
		
	}

}
