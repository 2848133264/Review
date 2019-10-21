package com.ThreadT;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test_threadPool {

	
	
	/**
	 * 线程池
	 * @param args
	 */
	public static void main(String[] args) {
		
		ExecutorService executorService =Executors.newFixedThreadPool(5);
		executorService.execute(new A());
		executorService.shutdown();
	}
	
}

class A implements Runnable{

	@Override
	public void run() {
		System.out.println(" A ");
	}
	
}
