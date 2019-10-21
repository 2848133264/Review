package com.Interface;


abstract class AA{
	abstract void showAA();
	AA(){
		
	}
	int i;
	static void showmmmm(){
		System.out.println("jkkk");
	}
}
interface A{
	//接口中的属性是static final类型的
	static final int age = 12;
	//接口中是可以有自己的方法，JDK 8 以上版本度可以
	//记得加上default 关键字   or  static 关键字
	default void show(){
		
	}/*
	static void showMsg(){
		System.out.println("我是 A 接口 中的showMsg");
		//此方法是不能够重写的
	}
	*/
}



interface B{
	//方法都是抽象方法 
    void showMsg();
    int i=0 ;
}

interface CC{
	void showCC();
}

interface C extends A,B{
	 //接口可以实现多继承
	
	void shh();
    default void showMsg() {
    	System.out.println("我是C接口中的default 关键字修饰的方法 ");
    	
       C c=  new C() {

		@Override
		public void shh() {
			// TODO Auto-generated method stub
			
		}
    		
		};
    	
    	AA  a= new AA() {
			
			@Override
			void showAA() {
				// TODO Auto-generated method stub
				
			}
		};
    }
}

public class Test_interface implements C {

	@Override
	public void showMsg() {
		 System.out.println("我是类重写 showMsg的 方法 ");
	 }
	//如果说，子类中没有实现该类方法，其他的接口中定义了
	
	public static void main(String[] args) {
		Test_interface t =new Test_interface();
		t.showMsg();
//		t.showMsg();
		
		
	}

	@Override
	public void shh() {
		// TODO Auto-generated method stub
		
	}

	

}
