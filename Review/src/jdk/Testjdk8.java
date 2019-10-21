package jdk;

interface A{
	default void show(){
		System.out.println("我是jdk 8的接口特性！");
	}
	
}

//函数式接口  @FunctionalInterface  添加一个注解之后，该接口中就只能有且只有一个抽象方法，默认的方法体还是可以的
@FunctionalInterface
interface Function{
	void  mothod();
	default void show(){
		
	}
}

public class Testjdk8 {
	/**
	 * jdk 8 的特性：
	 * 1.接口中可以有default修饰的方法体
	 * 2.Lambda表达式
	 * 3.函数式接口：接口中只包含一个抽象方法，要加@FunctionInterface 注解
	 * 4.使用 ：：两个： 来传递方法，或者构造函数的应用
	 * 5.多重注解
	 * 6.增加了很多与函数式接口类似的接口以及与Map 相关的API
	 */
	public static void main(String[] args) {
		
		//使用线程执行表达式
		new Thread(()->{
			for (int i = 0; i <5; i++) {
				System.out.println(i);
			}
		}).start();
		String nameString = "";
		
		//
	}
	
	

}
