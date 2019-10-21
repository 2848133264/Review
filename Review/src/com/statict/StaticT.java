package com.statict;

class OutClass{
	OutClass(){
		System.out.println("我是  OutClass 构成方法");
	}
	static{
		System.out.println(" OutClass  static....");
	}
	{
		System.out.println(" OutClass static 无");
	}
}
public class StaticT extends OutClass{
	/**
	 * 测试这个static的执行过程
	 */
	StaticT(){
		System.out.println("StaticT 的构造方法");
	}
	static{
		System.out.println(" StaticT static....");
	}
	{
		System.out.println(" StaticT staticT 无");
	}
	
	
	//方法入口
	public static void main(String[] args) {
		
		new StaticT();
		
		//继承中，先会加载父类的static{}，加载子类的static{} |  之后加载父类的{}，之后就是父类的构造方法，加载子类的构造跟{}
		/**
		 * 结果：
		 *   OutClass  static....
			 static....
			 OutClass  staticT 无
			我是  OutClass 构成方法
			staticT 无
			StaticT 的构造方法

		 */
		String nameString  = new String("aaa");
		
		String intern = nameString.intern();//现在常量池中找，没有的话就会直接创建，之后比较
		
		System.out.println(intern== nameString);
	}
	
}


