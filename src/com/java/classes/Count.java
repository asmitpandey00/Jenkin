package com.java.classes;

import java.util.ArrayList;

public class Count {
	ArrayList<Integer> l = new ArrayList<Integer>();

	public void doCount() {
		l.add(15);
		l.add(24);
		l.add(35);
		l.add(44);
		l.add(45);
		l.add(62);
		System.out.println("List Before filter :: ");
		System.out.println(l);
		long count=l.stream().filter(i->i<=35).count();
		System.out.println(count);
}
}