package com.tnsif.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		System.out.println("The Size of Array list is:"+list.isEmpty());
		System.out.println("The Size of Array list is:"+list.size());
		list.add(22);
		list.add(34);
		list.add(4);
		list.add(50);
		list.add(1000);
		System.out.println(list);
		System.out.println("The Size of Array list is:"+list.isEmpty());
		System.out.println("The Size of Array list is:"+list.size());
		System.out.println(list.contains(1000));
		System.out.println("Element at the position "+list.get(4));
		list.remove(2);
		System.out.println(list);
		Collections.sort(list);
		
	}

}
