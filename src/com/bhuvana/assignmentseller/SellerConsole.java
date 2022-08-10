package com.bhuvana.assignmentseller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SellerConsole {

	List <SellerOutlet> sellerNames = new ArrayList <SellerOutlet> ();
	
	public void populateRecords() {
		sellerNames.add(new SellerOutlet(0, "bhuvanachandra", "bchndra@gmail.com", "Vizag"));
		sellerNames.add(new SellerOutlet(1, "raja ravindra", "raja@gmail.com", "Chennai"));
		sellerNames.add(new SellerOutlet(2, "raja ", "raj@gmail.com", "Hyderabad"));
		sellerNames.add(new SellerOutlet(3, "bhuvi", "bhu@gmail.com", "Mumbai"));
		sellerNames.add(new SellerOutlet(4, "rainna", "rai@gmail.com", "Hyderabad"));
		sellerNames.add(new SellerOutlet(5, "suresh", "suresh@gmail.com", "Chennai"));
	}
	
	public void addSeller(int sellerid, String sellername, String location, String selleremail) {
		sellerNames.add(new SellerOutlet(sellerid, sellername, location, selleremail));
		System.out.println("A new was Seller Added");
	}
	
	public void displayAllSellers() {
		sellerNames.stream().forEach((seller) -> System.out.println(seller));
	}
	
	public void searchById(int id) {
		sellerNames.stream()
		.filter((seller) -> id == seller.getId())
		.forEach((seller) -> System.out.println(seller));
	}
	
	public void deleteById(int id) {
		
		sellerNames =  sellerNames.stream()
		.filter((seller) -> id != seller.getId())
		.collect(Collectors.toList());
		
		sellerNames.stream()
		.forEach((seller) -> System.out.println(seller));
	}
	
	public void updateById(int id, String name, String location, String email) {
		sellerNames.stream()
		.filter((seller) -> id == seller.getId())
		.forEach((seller) -> {
			seller.setId(id);
			seller.setName(name);
			seller.setEmail(email);
			seller.setLocation(location);
		});
		
		sellerNames.stream().forEach((seller) -> System.out.println(seller));

	}
	
	public void displayByLocation(String location) {
		sellerNames.stream()
		.filter((seller) -> location.equals(seller.getLocation()))
		.forEach((seller) -> System.out.println(seller));
	}
	
}
