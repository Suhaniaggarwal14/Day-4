package com.graymatter;

public class Main {
	
	public static void main(String[] args) throws AgeNotSufficientException {
		Person p=new Person("Suhani",17);
		
		if(p.getAge()<18)
			throw new AgeNotSufficientException("Person age need to be equal to or more to cast vote");
		else {
			System.out.println("Person is eligible to cast vote");
			System.out.println(p);
		}
	}

}
