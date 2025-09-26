package com.map.demos;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

//		Map<Integer,String> map =new HashMap<>();
//		Map<Integer,String> map =new LinkedHashMap<>();
		Map<Integer,String> map =new TreeMap<>();

		map.put(1, "Ram");
		map.put(null, "Rohan");
		map.put(2, "null");
		map.put(3, "John");
		map.put(1, "Kevin");

		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.get(4));
		System.out.println(map.containsKey(4));
		System.out.println(map.getOrDefault(4, "Sri"));
        System.out.println(map);

        
        Set<Integer> keySet=map.keySet();
        for(Integer integer:keySet) {
        	System.out.println(integer+map.get(integer));
        }
        
       Set<Entry<Integer,String>> mapSet=map.entrySet();
       System.out.println(mapSet);
       for(Entry<Integer,String> entry: mapSet ) {
    	   System.out.println(entry);
       }
	}
	
	

}
