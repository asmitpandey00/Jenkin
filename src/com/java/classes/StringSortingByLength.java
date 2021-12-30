package com.java.classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSortingByLength {
	List<String> l = new ArrayList<String>();

	public void sortingByLength() {
		l.add("ram");
		l.add("krishna");
		l.add("asmit");
		l.add("mukesh");
		l.add("shilpi");
		l.add("sita");
		System.out.println("List Before Sorting :: ");
		System.out.println(l);
		Comparator<String> comp = (i, j) -> {
			int l1 = i.length();
			int l2 = j.length();
			if (l1 > l2) {
				return +1;
			} else if (l1 < l2)
				return -1;
			else
				return i.compareTo(j);

		};
		/*
		 * REVERSE ORDER
		 * Comparator<String> comp2 = (i, j) -> { int l1 = i.length(); int l2 =
		 * j.length(); if (l1 < l2) { return +1; } else if (l1 > l2) return -1; else
		 * return j.compareTo(i);
		 * 
		 * };
		 */
		List<String> l2 = l.stream().sorted(comp).collect(Collectors.toList());
		System.out.println("List after Sorting :: ");
		System.out.println(l2);
	}

}
