package com.datayouxian;

public class Count运算优先级 {
	
	/**
	 * 运算符的优先级
	 * 高到低的层次
	 * 
	 * () 括号的优先级别最高【】
	 * 
	 * ：自加/自减  > 	算术运算符  > 		比较运算符   > 				逻辑 运算符 			 > 		赋值运算符：
	 * ：(++/--，！)      (*-+/%)          ( >, >=,<,<=,==,!=)		   (&,^,|,&&,|| )			+=,-=,*=,/=,?:
	 * 
	 */
	
	public static void main(String[] args) {
		int i =1;
		int j =2;
		int a =i+++j+++i++;
		int sum = ++i+j;
		int b =(i++)+(j++)+(i++);
		//		1+2+2= 5
		System.out.println(a);
		System.out.println(b);
		
		
		
	}
}
