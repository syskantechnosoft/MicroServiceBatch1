package com.tcs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Starter {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("ABC", "ADE", "AED", "AUS", "ALM", "BCD","XYZ","XL","XXL");
		
		List<String> result = names.stream().filter(s->s.startsWith("X")).collect(Collectors.toList());
		
		System.out.println(result);
	}

}
