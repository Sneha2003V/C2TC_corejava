package org.tnsif.java;

import org.tnsif.java.Citizen;

public class MethodOverridingMain extends Citizen {

	public MethodOverridingMain(long aadharNo, String nationality, String dob, String address) {
		super(aadharNo, nationality, dob, address);
		// TODO Auto-generated constructor stub
	}


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI sb= new SBI();
		System.out.println(sb.getRateofInterest());
		
		RBI ic= new ICICI();
		System.out.println(ic.getRateofInterest());
		
		//Citizen c = new Citizen();
		 MethodOverridingMain m = new  MethodOverridingMain(aadharNo, address, address, address);
		

	}

}