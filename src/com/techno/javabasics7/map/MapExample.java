package com.techno.javabasics7.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public interface MapExample {

	public static void main(String[] args) {
		Map map=new HashMap();
		System.out.println(map.put(1,"tjbc"));;
		map.put(2,1);
		System.out.println(map.put(3,true));;
		System.out.println(map.put(3,false));;
		map.put(5,'c');
		map.putIfAbsent(4,"hiied");
		System.out.println(map.put(2,"hii"));
		map.replace(3,"replace");
		map.remove(1);
		System.out.println(map.replace(2, "hii", "hello"));
		System.out.println(map.containsKey(2));;
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map);
		System.out.println(map.size());
		
	

		
		
	}
}
