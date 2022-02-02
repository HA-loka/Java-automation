package com.ha.shoppingcart;

public class Cart {
	int Id;
	private String Description;
	private int quantity;
	private double price;
	
	Cart(int Id){
		Id=Id;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
