package com.java.classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxValue {
	ArrayList<Integer> l = new ArrayList<Integer>();

	Comparator<Integer> comp1 = (i, j) -> {
		if (i < j)
			return -1;
		else if (i > j)
			return 1;
		else
			return 0;
	};
		public void doMax()
		{
			l.add(31);
			l.add(12);
			l.add(33);
			l.add(44);
			l.add(54);
			l.add(16);
			System.out.println(l);
			int min  = l.stream().max(comp1).get();	
			System.out.println("max value "+min);
		}
		}
		

