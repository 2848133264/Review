package com.ThreadT;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test_callable implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		
		return "我是callable";
	}
	
	public static void main(String[] args) throws Exception{
		Test_callable t =new Test_callable();
		
		FutureTask<Object> task = new FutureTask<>(t);
		new Thread(task).start();
		
		
		System.out.println(task.get());
		
	}

}
