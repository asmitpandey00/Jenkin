package com.java.test;

import java.util.List;
import java.util.Optional;

import javax.swing.DefaultListCellRenderer;

import com.java.classes.AddGraceToFailedStudent;
import com.java.classes.CostemisedSortingOnString;
import com.java.classes.CostemizedSortingList;
import com.java.classes.Count;
import com.java.classes.DefaultListSorting;
import com.java.classes.Filter;
import com.java.classes.Map;
import com.java.classes.MaxValue;
import com.java.classes.MinValue;
import com.java.classes.StringSortingByLength;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * Filter f=new Filter(); f.collectPrime() ;
		 */
		 
		/*
		 * Map map=new Map(); map.doConcat();
		 */
		/*
		 * AddGraceToFailedStudent std=new AddGraceToFailedStudent(); std.doConcat();
		 */
		/*
		 * Count count=new Count(); count.doCount();
		 */
		/*
		 * DefaultListSorting sorting=new DefaultListSorting(); sorting.doSort();
		 */
		/*
		 * CostemizedSortingList sortingList=new CostemizedSortingList();
		 * Optional<List<Integer>> l= sortingList.doSort(); if(l.isPresent()) {
		 * l.stream().forEach(i->System.out.println(i)); }
		 */
		
		/*
		 * StringSortingByLength sortingByLength=new StringSortingByLength();
		 * sortingByLength.sortingByLength();
		 */
		/*
		 * MinValue v=new MinValue(); v.doMin();
		 */
		/*
		 * MaxValue v=new MaxValue(); v.doMax()
		 */
		CostemisedSortingOnString sorting=new CostemisedSortingOnString();
		Optional<List<String>> opt=sorting.doSorting();
		if(opt.isEmpty())
		{
			opt.stream().forEach(i->System.out.println(i));
		}
		else 
		{
			System.out.println("Empty List");
		}
		
	}

}
