package com.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student{
	private String name ;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}

//实现比较器
class MyTreeComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Student student1 =(Student) o1;
		Student student2 =(Student) o2;
		if(student1.getAge() > student2.getAge()){
			return -1;
		}else if (student1.getAge() < student2.getAge()) {
			return 1;
		}
		return 0;
	}
	
}

public class SetT_TreeSet {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("lzl");
		student.setAge(15);
		
		Student student2 =new Student();
		student2.setName("lzl2");
		student2.setAge(16);
		@SuppressWarnings({ })
		
		/*TreeSet set =new TreeSet<>();
		set.add(student);
		set.add(student2);*/
		
		/*
		 * 没有这个比较器的时候出现错误。
		 * Exception in thread "main" java.lang.ClassCastException: com.collection.Student cannot be cast to java.lang.Comparable
		 */
		
		//添加了迭代器
		MyTreeComparator comparator =new MyTreeComparator();
		TreeSet<Student> set =new TreeSet<>(comparator);
		set.add(student);
		set.add(student2);
		System.out.println(set.size());
		//输出语句
		Iterator<Student> iterator =set.iterator();
		while(iterator.hasNext()){
			Student next = iterator.next();
			System.out.println(next);
			
		}
	}
	
	
}
