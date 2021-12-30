package com.java.classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultListSorting {
	ArrayList<Integer> l = new ArrayList<Integer>();

	public void doSort() {
		l.add(31);
		l.add(12);
		l.add(33);
		l.add(44);
		l.add(54);
		l.add(16);
		System.out.println("List Before filter :: ");
		System.out.println(l);
		List<Integer> l2 = l.stream().sorted().collect(Collectors.toList());
		System.out.println("SortedList::");
		System.out.println(l2);
		System.out.println("Iteration");
		l2.forEach(i -> System.out.println(i));
	}
}