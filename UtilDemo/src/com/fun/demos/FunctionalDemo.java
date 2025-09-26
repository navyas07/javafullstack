package com.fun.demos;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalDemo {

	public static void main(String[] args) {

		Consumer<String> consumer=str->System.out.println(str.toUpperCase());
		consumer.accept("Sri");
		
		Consumer<Integer> con1=num->System.out.println(num+10);
		con1.accept(10);
		
		Supplier<Integer> supplier=()-> 10;
		System.out.println(supplier.get());
		
		Predicate<String> predicate=str->str.equals("priya");
		System.out.println(predicate.test("navya"));
		
		Function<String, Integer> function=str->str.length();
		System.out.println(function.apply("Navya"));
	}

}
