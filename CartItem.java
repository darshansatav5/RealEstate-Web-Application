package com.example.demo.cartItem;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.example.demo.Cart.Cart;
import com.example.demo.property.Property;

@Entity
public class CartItem
{
	@Id
	private int cartItemId;
	private double prize;

	
	//Relatioship with Other Table
	@ManyToOne
	private Cart cart;
	
	@OneToOne
	private Property properties;
	


	public CartItem(int cartItemId, double prize, Cart cart) {
		super();
		this.cartItemId = cartItemId;
		this.prize = prize;
		this.cart = cart;
	}

	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Property getProperties() {
		return properties;
	}

	public void setProperties(Property properties) {
		this.properties = properties;
	}
	
	
}
