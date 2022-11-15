package com.tcs;

import java.util.stream.Stream;

public class Starter2 {

	public static void main(String[] args) {
		Stream.iterate(1, e -> e + 1).filter(e -> e % 3 == 0).limit(10).forEach(System.out::println);
	}

}
