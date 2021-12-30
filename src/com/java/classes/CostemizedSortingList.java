package com.java.classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CostemizedSortingList {
	ArrayList<Integer> l = new ArrayList<Integer>();

	public Optional<List<Integer>> doSort() {
		l.add(31);
		l.add(12);
		l.add(33);
		l.add(44);
		l.add(54);
		l.add(16);
		Comparator<Integer> comp1 = (i, j) -> {
			if (i < j)
				return 1;
			else if (i > j)
				return -1;
			else
				return 0;
		};
	
		//Comparator<Integer> comp2 = (i, j) -> (i > j) ? 1 : (i < j) ? -1 : 0;
		/*
		 * System.out.println("List Before filter :: "); System.out.println(l);
		 */
		 List<Integer> l2=l.stream().sorted(comp1).collect(Collectors.toList());
		// List<Integer> l2=l.stream().sorted(comp2).collect(Collectors.toList());
		//List<Integer> l2 = l.stream().sorted((i, j) -> j.compareTo(i)).collect(Collectors.toList());

		/*
		 * System.out.println("SortedList::"); System.out.println(l2);
		 * System.out.println("Iteration");
		 */
		//l2.forEach(i -> System.out.println(i));
		return Optional.of(l2);
	}

}
