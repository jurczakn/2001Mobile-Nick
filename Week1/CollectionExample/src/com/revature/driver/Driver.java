package com.revature.driver;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		
		List<String> sList = new LinkedList<String>();
		
		sList.add("First Element");
		sList.add("Second Element");
		sList.add("Third Element");
		
		System.out.println(sList.get(1));
		
		for (String s: sList) {
			System.out.println(s);
		}
		
		Iterator<String> sListIter = sList.iterator();
		
		while(sListIter.hasNext()) {
			String s = sListIter.next();
			if (s.equals("Second Element")) {
				continue;
			}
			System.out.println(s);
			
		}
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		iSet.add(new Integer(2));
		
		//AutoBoxing - automatic process where Java
		//converts our primitives into the Wrapper Classes
		//whenever an Object is expected.
		iSet.add(2);
		
		stuff(5);
		
		//AutoUnBoxing - automatic process where Java
		//converts our Wrapper Classes to primitives
		//whenever a primitive is expected.
		stuff(iSet.iterator().next());
		
		stuff(new Integer(5));
		
		System.out.println(new Integer(7) + new Integer(9));
		
	}
	
	public static void stuff(int x) {
		System.out.println(x);
	}

}
