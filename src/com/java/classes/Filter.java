package com.java.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
	ArrayList<Integer> l = new ArrayList<Integer>();
	Predicate< Integer> checkPrime=(num)->{
		for(int i=2;i<(num/2);i++)
		{
			if(num%i==0)
			{
				return false;
						}
		}
		return true;
	};
	
	public void collectPrime()
	{
		l.add(11);
		l.add(22);
		l.add(33);
		l.add(47);
		l.add(53);
		l.add(63);
		List<Integer> l1=l.stream().filter(checkPrime).collect(Collectors.toList());
		l1.forEach(i->System.out.println(i));
	}
	public void doFilter() {
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		System.out.println("List Before filter :: ");
		System.out.println(l);

		Stream<Integer> s=l.stream();
		List<Integer> l2=s.filter(i->i%2==0).collect(Collectors.toList());
		l2.forEach(i->System.out.println(i));
	}
}
