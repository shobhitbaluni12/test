package com.test.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("abc");
		l.add(1);
		
		for (Object l1 : l) {
			System.out.println(l1);
		}
		
		System.out.println("----------");
		Iterator itr = l.iterator();
		
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.println(object);
			
		}
		
		ListIterator litr = l.listIterator();
		while (litr.hasNext()) {
			Object object = (Object) litr.next();
			System.out.println(object);
			
		}
		System.out.println("----------");
		System.out.println(l.size());
		System.out.println(l.get(1));
		System.out.println(l.contains("abc"));
		System.out.println(l.contains("pqr"));
	
		
		
		
	}

}
