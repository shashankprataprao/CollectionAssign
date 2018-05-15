package myCollection;

import java.util.*;

public class MyArrayList {
public List<MyObject> myList = new ArrayList<>();
public Set<MyObject> mySet = new HashSet<>();
public List<MyObject> myVector = new Vector<>();



public static void main(String[] args) {
	MyObject o = new MyObject("shruti", 23, 100000, "Goa");
	
	MyArrayList m = new MyArrayList();
	m.myList.add(o);
	m.mySet.addAll(m.myList);
	m.mySet.addAll(m.myList);
	m.mySet.addAll(m.myList);
	m.myVector.addAll(m.mySet);
	System.out.println(m.myList.toString());
	System.out.println(m.mySet.toString());
	System.out.println(m.myVector.toString());
}
}


