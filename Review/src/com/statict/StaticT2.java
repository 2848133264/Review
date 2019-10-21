package com.statict;

public class StaticT2{
	/**
	 * 测试这个static的执行过程
	 */
	StaticT2(){
		System.out.println(" StaticT 的构造方法");
	}
	
	static{
		System.out.println(" StaticT static....1");
	}
	//没有static 修饰的
	{
		///次代码域岁对象的创建多次加载，但是优先于构造方法。
		int i= 15;
		System.out.println(" StaticT staticT 无");
	}
	static{
		System.out.println(" StaticT static....2");
	}
	
	
	//方法入口
	public static void main(String[] args) {
		
		new StaticT2();
		new StaticT2();
	
	}
	
}


