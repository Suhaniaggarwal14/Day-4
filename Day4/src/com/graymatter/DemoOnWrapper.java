package com.graymatter;

public class DemoOnWrapper {
	public static void main(String[] args) {
		int i=67;
		Integer iobj=i;
		Integer iobj1=(Integer)i;

		int j=iobj;
		int j1=iobj.intValue();

		Character c='i';
		char c1=c;

		Boolean b=false;
		boolean b1=b;

		@SuppressWarnings("removal")
		Integer i1=new Integer(12);
		int i2=i1;
		System.out.println(i1);
		
		
		
		String s1="1";
	//	int num=(int)s1;
		Integer i3=Integer.parseInt(s1);
		
		String s=i3.toString();
		
		System.out.println(i3);
		
		Object obj=new Object();
		String sobj=(String)obj;
		obj=sobj;
		
		
		
		
		
	}



}