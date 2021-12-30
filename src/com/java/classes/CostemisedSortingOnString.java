package com.java.classes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CostemisedSortingOnString {
	Comparator<String> sortString = (s1, s2) -> {

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		return s2.compareTo(s1);
	};

	public Optional<List<String>> doSorting() {
		List<String> list = Arrays.asList("ram", "sita", "asmit", "bakshi", "murgun");
		List<String> l = list.stream().sorted(sortString).collect(Collectors.toList());

		return Optional.of(l);

	}

}
