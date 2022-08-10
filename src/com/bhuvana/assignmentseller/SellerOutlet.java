package com.bhuvana.assignmentseller;

public class SellerOutlet {
	private int id;
	private String name;
	private String email;
	private String location;
	
	public SellerOutlet(int sellerid, String sellername, String selleremail, String location) {
		this.id = sellerid;
		this.name = sellername;
		this.email = selleremail;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString() {
		return "Seller Id - " + id +
				", Seller Name - " + name + 
				", Seller Email - " + email + 
				", Seller Location - " + location;
	}
	
}


