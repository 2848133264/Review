package com.exception;

public class ExceptionT {
	/**
	 * 异常和错误的区别是什么？
	 * 错误error 是这个系统的错误，程序无法控制，比如JVM 内存溢出，分配内存地址错误等，这些错误程序是无法控制
	 * 异常是JVM可以处理的
	 * 
	 * error 和exception 的基类都是java.lang.Throwable 类的
	 * @throws MyExceptin 
	 */
	public static void main(String[] args) throws MyExceptin {
		
//		test(1, 0);//异常执行
//		test(2, 3);//正确输入
		testMyException();
	}
	
	//try catch(e) finally{}
	public static void test(int a,int b){
		
		try {
			
			/**
			 * 将有可能出错的代码放入try中
			 */
			int div =a/b;
			System.out.println(div);
			
		} catch (Exception e) {
			/**
			 * 出现异常之后处理异常
			 */
			//可以打印堆栈信息
//			e.printStackTrace();
			System.out.println("Exception执行错误");
		}finally {
			/**
			 * 无论这个是否有异常，这个finally 块一定会执行
			 */
			System.out.println("finally 执行了");
		}
		
	}
	//自定义异常类
	/**
	 * 继承exception
	 * @throws MyExceptin 
	 */
	public static void testMyException() throws MyExceptin{
		
		try {
			
			int a = 5/0;
			System.out.println(a);
			
		} catch (Exception e) {
			// throw 抛出的是自定义异常
			throw new MyExceptin("算术异常");
		}
		
	}

}
