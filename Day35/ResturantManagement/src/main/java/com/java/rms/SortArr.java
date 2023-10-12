package com.java.rms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortArr {
	public static void main(String[] args) {
		Map<String, String> discMap = new HashMap<>();
		Map<Integer, String> names = new HashMap<>();
		discMap.put("cat", "meow");
		discMap.put("dog", "bark");
		discMap.put("dog", "bark1");
		
		names.put(1, "Rahul");
		names.put(2, "Ganesh");
		
		System.out.println(discMap.get("cat"));
		System.out.println(discMap.get("dog"));
		
		for(Entry<String, String> data : discMap.entrySet()) {
			System.out.println(data.getKey()+" "+data.getValue());
		}
	}
}
