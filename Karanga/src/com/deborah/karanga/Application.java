package com.deborah.karanga;

import java.util.Calendar;
import java.util.Date;

public class Application {

	public static void main(String[] args) {
		long l = System.currentTimeMillis();
		Date dateActuelle= new Date();
		System.out.println(dateActuelle.toString());
		
		System.out.println("Date = "+dateActuelle.getTime()+" l = "+l);


		System.out.println("getTime = "+Calendar.getInstance().getTime());
		System.out.println("getTimeInMillis() = "+Calendar.getInstance().getTimeInMillis());
		System.out.println("getTimeZone() = "+Calendar.getInstance().getTimeZone());
		
	}

}
