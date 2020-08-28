package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExcelMap extends Object {

	public static void main(String[] args) {

		//

		Map<Object, Object> map = new HashMap();

		map.put("name", "ajay");
		map.put("city", "vizag");
		map.put("job", "adp");

		System.out.println(map);

		Map map1 = new LinkedHashMap();

		map1.put("name", "ajay");
		map1.put("city", "vizag");
		map1.put("job", "adp");

		System.out.println(map1);

		map1.remove("name");

		map1.get("city");

		if (map1.containsKey("name")) {
			System.out.println("key available");
		} else {
			System.out.println("key not available");
		}

		map1.put("name", "ajay");

		for (Entry<Object, Object> entry : map.entrySet()) {
                  entry.getKey();
                  entry.getValue();
			
			
			
		}

	}

}
