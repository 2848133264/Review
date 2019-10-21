package com.ThreadT;

public class Test_thread extends Thread{

	@Override
	public void run() {
		
		//重写编写父类
		System.out.println("我是Thread 方式");
		//输出一个循环
		for (int i = 0; i < 2; i++) {
				System.out.print(i+ "  ");
		}
	}
	public static void main(String[] args) {
		
		Test_thread  t = new Test_thread();
		Thread t2 = new Thread(t);
		t2.start();
	}
}
