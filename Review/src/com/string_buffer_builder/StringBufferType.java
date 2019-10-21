package com.string_buffer_builder;

public class StringBufferType {

	/**
	 * stringbuffer：是一个线程同步安全的，它是字符串可以变的，当你stringbuffer默认的不够用的时候，会自动以 1.5 的大小增长
	 * stringbuffer：默认的空间为 16个字符的空间
	 * stringbuffer:执行的效率比较低，stringbuilder 是相反的。
	 */
	public static void main(String[] args) {
		
		test1();
	}
	//stringbuffer的构造方法
	@SuppressWarnings("unused")
	public  static void test(){
		//第一种方式：
		StringBuffer buffer =new StringBuffer();//默认有16个
		//第二种
		StringBuffer buffer2 =new StringBuffer(520);//分配520个字符缓存区
		//第三种
		StringBuffer buffer3 =new StringBuffer("大家好");//接收字符串，用来设置初始内容，并在不重新分配的情况下还有 16 个字符的缓冲区
	}
	//stringbuffer的常用方法
	@SuppressWarnings("unused")
	public static void test1(){
		
		StringBuffer buffer =new StringBuffer("大家好");
		//添加字符,可以添加char ,stringbuffer ,int ,byte 等等  object类型的都能
		buffer.append('c');
		buffer.append(true);
		char str[] ={'a','b'};
		buffer.append(str);
//		buffer.append(obj);
		System.out.println(buffer);
	}
}
