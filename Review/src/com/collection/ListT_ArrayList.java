package com.collection;

import java.util.ArrayList;

import javax.swing.JSpinner.ListEditor;

public class ListT_ArrayList {
	
	//list下的ArrayList 类
	/**
	 * 特点是：ArrayList 对象是长度可变的对象跟数组，类似于动态的数组
	 * 动态扩展，随着元素的添加，元素的数目会增加，列表也会随着扩展，元素有序的
	 * 再访问和遍历对象，性能好
	 */

	//下面是一个测试
	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		//添加元素  object 类型就是包括所有的了
		list.add(15);
		list.add("ddd");
		list.add(15.5F);
		list.add("c");
		//遍历集合
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println();
		//删除集合的数据
		list.remove(0);
		list.remove("c");//当是一个string类型的时候，删除成功
		//遍历集合
		for (Object object : list) {
			System.out.println(object);
		}
		//其他方法
		boolean flag = list.isEmpty();//判断是否为空
		System.out.println(flag);
		//是否包含某个对象
		boolean contains = list.contains("c");//false
		System.out.println(contains);
		
		
	}
}
