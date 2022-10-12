package com.Day5_Activity.Day5_Activity;
import java.util.*;

public class TreeMapDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>map=new TreeMap<Integer,String>();
		map.put(1, "Vansika");
		map.put(2, "Priya");
		map.put(3, "Sonali");
		map.put(4, "Puja");
		System.out.println("Descending Map:"+map.descendingMap());
	}		


}
