package com.collection;

import java.util.HashSet;

public class SetT_HashSet {
	
	@SuppressWarnings({ "unused", "unchecked" })
	public static void main(String[] args) {
		
		//Hashset 无序，不能重复，在需要性能而无关顺序的环境下是个不错的选择
		@SuppressWarnings("rawtypes")
		HashSet set =new HashSet();
		set.add(1e5);
		for (Object object : set) {
			System.out.println(object);
		}
		//创建一个容量为20 的散列集合
		HashSet<Object> hashSet =new HashSet<>(20);
		//容量为2 的散列集合，容量填充比为2；两倍的容量进行填充
		HashSet<Object> set2 =new HashSet<>(2, 2);
		
		//集合的可迭代特性。Iteration。
	}

}
