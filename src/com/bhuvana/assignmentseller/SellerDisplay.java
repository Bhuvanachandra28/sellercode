package com.bhuvana.assignmentseller;

import java.util.Scanner;

public class SellerDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellerConsole sc = new SellerConsole();
		
		sc.populateRecords();
		sc.displayAllSellers();
		
		@SuppressWarnings("resource")
		Scanner scs = new Scanner(System.in);
		System.out.println("choose 1 to add the feild ");
		System.out.println("choose 2 to delete the 3rd feild ");
		System.out.println("choose 3 to update the feilds ");
		System.out.println("choose 4 to display the chennai feild ");
		int s = scs.nextInt();
		
		switch(s){
			
			case 1:
				sc.addSeller(25, "bhuvana", "bhuvana@gmail.com", "vizag");
				break;
			
			case 2:
				sc.deleteById(3);
				break;
			case 3:
				sc.updateById(4, "chandra", "hyd", "chandra@gamil.com");
				break;
			case 4:
				sc.displayByLocation("Chennai");
				break;
			default:
				System.out.println("choose the correct option");
		}
 
	}}
