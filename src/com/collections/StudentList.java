package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentList {

	public static void main(String[] args) {

		// java.io, java.lang, java.util 100 -- 10 > 90
		// 10 > 20 > 21 30

		ArrayList<String> list = new ArrayList();

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
