package com.tnsif.oops_demo;

public class Encap_main {
	public static void main(String[]args) {
		//Object creation
		
		EncapDemo obj = new EncapDemo();//new=keyword to create object
		obj.setSerialNum(63);
		obj.setName("Muskan");
		obj.setAge(22);
		System.out.println(obj);
	}

}
