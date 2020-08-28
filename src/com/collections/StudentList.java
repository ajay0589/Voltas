package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentList {

	public static void main(String[] args) {

		// java.io, java.lang, java.util 100 -- 10 > 90
		// 10 > 20 > 21 30

		List<String> list = new ArrayList(); // LinkedList
		// add, remove, get, iterate, override, sorted 2 5 1 4 3
		list.add("kusuma");
		list.add("sudheer");
		list.add("srinu");
		list.add("rithika");
		list.add("sherley");
		list.add("kusuma");
		list.add("sudheer");
		list.add("srinu");
		list.add("rithika");
		list.add("sherley");
		list.add("sherley");
		list.add("sherley");
		
		
		
		

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		for (String string : list) { // Arrays, Collections
			System.out.println(string);
		}

		// Iterator
		
		Set set = new HashSet<String>(list);

		System.out.println(list);
		System.out.println(set);

		list.remove("srinu");

		System.out.println(list);

		list.remove(2);

		System.out.println(list);

		System.out.println(list.get(1));

		ArrayList<Integer> list2 = new ArrayList();

		list2.add(123);
		list2.add(456);

	}

}
