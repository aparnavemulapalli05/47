package com.advance.flatmap;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class FlatMapApp {

	public static void main(String[] args) {
		Integer[][] lotteryNumbers=new Integer[][] {
			{5,23,54,60,22},
			{15,2,34,77,81},
			{5,7,89,63,52}
			};
	List<Integer>lotteryNumberSet=Stream.of(lotteryNumbers)
			             .flatMapToDouble(Stream::of)
			             .distinct()
			             .collect(Collectors.toList());
	System.out.println("lottery numbers last three weeks:" +lotteryNumberSet);
	
	List<List<String>>fruits=List.of(
			 List.of("apple","bannana","lemon"),
			 List.of("pineapple","jamun","kiwi"));
	
	List<String> fruitsList=fruits.stream()
			.flatMap(Collection::stream)
			.collect(Collectors.toList());
	System.out.println("available fruits:" +fruitsList);
			  

	}

}
