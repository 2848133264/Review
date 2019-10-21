package com.collection;

import java.util.LinkedList;
import java.util.List;

public class ListT_LinkedList {

	/**
	 * arraylist 和 linkedlist 的区别是：
	 * 
	 * 顺序表的优点是：节省空间，不用为表示节点间的逻辑关系而增加额外的存储开销
	 * 随机访问速度高，顺序表具有按照元素序号随机访问。
	 * 缺点：
	 * 顺序表插入，删除操作时，平均移动表中的一半元素，因此对较大的顺序表效率低。
	 * 需要预先分配足够大的存储空间，估计过大，可能导致顺序表大量闲置，过小就溢出。
	 * 
	 * 链表：
	 * 
	 * 插入，删除运算方便。
	 * 不需要预先分布连续的存储空间。
	 * 缺点：
	 * 要占用额外的存储空间元素之间的关系，储存密度降低。
	 * 链表不是一种随机储存结构，不能随机存取元素
	 */
	
	
	/**
	 * 链表的知识点：
	 *  void addFirst(Object obj); //在头部添加数据
		void addLast(Object obj); //在尾部添加数据
		void add(int index,Object obj); //指定位置添加数据
		Object getFirst( ); //从头部读取数据
		Object getLast( ); //从尾部读取数据
		Object removeFirst( ); //从头部移除数据
		Object removeLast( ); //从尾部移除数据
	 */
	/**
	 * linkedlist 相对于顺序的ArrayList来说，在列表中插入数据或者删除数据时，效率更高
	 * ArrayList  随机访问数据的效率比较高，插入删除的效率比linkedlist。
	 */
	public static void main(String[] args) {
		
		List< Object> list =new LinkedList<>();
		list.add(1);
		list.add(15);
		List< Object> c =new LinkedList<>();
		c.add("java");
		c.add(159);
		list.addAll(c);
		
		//集合的遍历
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println("............");
		LinkedList<Object> linkedList =new LinkedList<>();
		//放在头部元素
		linkedList.addFirst("firstNum");
		linkedList.add(153222);
		linkedList.add("中间");
		//放在尾部元素
		linkedList.addLast("lashName");
		for (Object object : linkedList) {
			System.out.println(object);
		}
		System.out.println(".........");
		//删除元素
		linkedList.remove();//删除的是默认第一个位置
		linkedList.removeLast();//删除最后一个
		for (Object object : linkedList) {
			System.out.println(object);
		}
		
		
		
		
	}
}
