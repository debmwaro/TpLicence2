package com.deborah.karanga;


import java.util.Date;

public class Application {

	private static final String FirstName = null;

	public static void main(String[] args) {
		long l = System.currentTimeMillis();
		Date dateActuelle= new Date();
		System.out.println(dateActuelle.toString());
		
		System.out.println("Date = "+dateActuelle.getTime()+" l = "+l);
		
		
		


	}

}
