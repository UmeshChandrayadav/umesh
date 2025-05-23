package com.tnsif.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopDemo {
	public static void main(String args[]) {
		List<Laptop>laps=new ArrayList<Laptop>();
		laps.add(new Laptop("dell",15,169999));
		laps.add(new Laptop("asus",22,160489));
		laps.add(new Laptop("Apple",2,177878));
Collections.sort(laps);
for(Laptop l :laps) {
	System.out.println(l);
		}
	}
	

}