package com.map.demos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapStateDemo {

	public static void main(String[] args) {
		Map<String,List<String>> states=new HashMap<>();
		states.put("Karnataka", Arrays.asList("Bengaluru","Mysore","Kodagu","Raichur"));
		states.put("Tamil Nadu", Arrays.asList("Chennai","Madhurai","Coimbatore","Kanyakumari"));
		states.put("Andhrapradesh", Arrays.asList("Hyderabad","Tirupati","Telangana","Vishakapatnam"));

		System.out.println(states);
	
	}
}
