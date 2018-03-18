package com.deborah.tp.chap2;

public class Exercice1 {

	public static void main(String[] args) {
		
		
		Exercice1 exo = new Exercice1();
		boolean test = exo.isEqual(2.1, 2.2, 0.05);
		boolean test1 = isEquals(2.1, 2.2, 0.05);
		System.out.println("test1 = "+test1);
		double x = Math.sqrt(2);
		System.out.println("La racine de 2 = "+x);

	}
	
	
	
	public static boolean isEquals(double a,double b,double error) {
		
		double diff = a - b;
		if(Math.abs(diff) < error) {
			return true;
		}else {
			return false;
		}
	}
	
    public boolean isEqual(double a,double b,double error) {
		
		double diff = a - b;
		if(Math.abs(diff) < error) {
			return true;
		}else {
			return false;
		}
	}


}
