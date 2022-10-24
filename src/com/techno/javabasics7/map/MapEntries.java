package com.techno.javabasics7.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntries {

	public static void main(String[] args) {
		Map map = new HashMap<Integer, String>();
		map.put(1, "kiran");
		map.put(2, "pooja");
		map.put(3, "rani");

		System.out.println(map);
		Set set = map.entrySet();
		System.out.println(set);

		Set<Map.Entry<Integer, String>> entries = map.entrySet();

		for (Entry<Integer, String> entry : entries) {
			if (entry.getKey() == 2) {
				entry.setValue("krishna");
			}
			System.out.println(entry);
		}
		
		ArrayList arrayList=new ArrayList<>(entries);
		 ListIterator iterator=arrayList.listIterator();
		 
		 while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
   while (iterator.hasPrevious()) {
	   System.out.println(iterator.previous());
	
}
	}
}
