package com.tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> squares = numbers.stream().map(a -> a * a).collect(Collectors.toList());
		System.out.println(numbers);
		System.out.println(squares);
		
		
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(5);
		numberList.add(6);
		numberList.add(7);
		numberList.add(8);
		numberList.add(9);
		
		List<Integer> squareList = new ArrayList<Integer>();
		numberList.forEach(n-> squareList.add(n*n));
		System.out.println(numberList);
		System.out.println(squareList);
	}

}
