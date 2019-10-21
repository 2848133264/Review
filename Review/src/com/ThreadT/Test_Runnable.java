package com.ThreadT;

public class Test_Runnable  implements Runnable{

	

	@Override
	public void run() {
		//实现父类的方法
		System.out.println("我是Runnable 方式实现多线程");
		
	}
	
	public static void main(String[] args) {
		Test_Runnable t =new Test_Runnable();
		new Thread(t).start();
	}

}
