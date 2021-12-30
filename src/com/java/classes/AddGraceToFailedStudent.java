package com.java.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddGraceToFailedStudent {
	ArrayList<Integer> l = new ArrayList<Integer>();

	public void doConcat() {
		l.add(15);
		l.add(25);
		l.add(33);
		l.add(42);
		l.add(55);
		l.add(62);
		System.out.println("List after Cancat :: ");
		System.out.println(l);
		List<Integer> l2 = l.stream().filter(i->i<=35).map(i->i+10).collect(Collectors.toList());
		System.out.println(l2);
		System.out.println("Iteration");
		l2.forEach(i -> System.out.println(i));
	}
}
