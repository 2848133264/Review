package com.string_buffer_builder;

public class StringType {

	/**
	 * string 类型的数据：是不可变的长度的，string类是final类型的，不能被继承的。
	 * 
	 * string 类用final关键字修饰的原因是，它经常被使用，为了高效率方便快捷的使用该类，所以定义为fianl关键字修饰
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		init();
		test();
		
	}
	//string 类型的基本操作
	public static void test(){
		
		//计算字符串长度
		String name ="stringnametest ";//15 个长度
		System.out.println("name = "+name.length());
		//拼接操作，查看地址
		System.out.println(name.hashCode());
		//准备拼接
		String nameconcat = "GG";
		name = name+nameconcat;
		System.out.println(name.hashCode());
		//result :二次的地址不同，说明在内存中的执行方式就是（先在内存开辟 name 和 nameconcat 变量，之后
		//name = name + nameconcat ；会新开辟一个内存空间，之后再让  name 指向这个新的栈地址空间 ）
		//-1564224206
		//19093906
		/**
		 * 
		  比较字符串，==，equals方式比较
		  == 比较的是内存地址，而equals比较的是内容
		  比较的机制是：提取一个字符一个字符比较，区分大小写
		 */
		System.out.println(name =="stringnametest GG");//false
		System.out.println(name.equals("stringnametest GG"));//true
		/**
		 * 忽略大小写
		 */
		System.out.println(name.toLowerCase().equals("stringnametest GG"));//false
		System.out.println(name.toLowerCase().equals("stringnametest GG".toLowerCase()));//true
		/**
		 * 转大小写，去除两边的空格，字符串数据切割成为数组,截取数据等操作
		 */
		
	}
	//string 类型数据的声明
	public static void init(){
		
		//定义一个string类型
		String aString = "I am string";
		System.out.println(aString);
		//空格也是算长度
		System.out.println(aString.length());
		//第二种方式定义一个string类型
		String bString =new String("I am string "); 
		System.out.println(bString);
	}
}
