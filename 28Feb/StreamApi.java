package com.cts.training.Stream.Feb28;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		addNames(names);
		System.out.println(names);
		// 1. print name with length more than 6
		List<String> namesWith = names.stream().filter(s -> s.length() > 6).collect(Collectors.toList());

		System.out.println();
		namesWith.forEach(System.out::println);

		// 2. Names in Upper Case
		List<String> namesInUpper = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		namesInUpper.forEach(System.out::println);

		long count = names.stream().count();
		System.out.println("List count is:" + count);

		Stream<Integer> data = Stream.of(1, 11, 111, 11111);
		System.out.println("data Count:" + data.count());

		Stream<String> language = Stream.of("c", "c++", "Java", "python", "Angular");
		List<String> result = language.filter(s -> s.length() > 4).collect(Collectors.toList());
		System.out.println("greater than 4" + result);
		Stream<String> languages = Stream.of("c", "c++", "Java", "python", "Angular");
		List<String> result1 = languages.map(s -> s.concat(" programming ")).collect(Collectors.toList());
		System.out.println(result1);
		// 3.sort the list
		List<String> defaultSorted = names.stream().sorted().collect(Collectors.toList());

		defaultSorted.forEach(System.out::println);
		List<String> Custom = names.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());

		System.out.println("descending Sorting is");
		Custom.forEach(System.out::println);

	}

	private static void addNames(ArrayList<String> names) {
		// TODO Auto-generated method stub
		names.add("Naveen");
		names.add("Niraj");
		names.add("pulkit");
		names.add("Bharat");
		names.add("vijay");
		names.add("Namish");

	}

}
