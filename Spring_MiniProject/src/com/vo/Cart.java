package com.vo;

import java.util.Date;

public class Cart {
	/**
	 * Product Table FK & Composite Key (p_id,c_id)
	 */
	private String p_id;
	/**
	 * Cust Table FK & Composite Key (p_id,c_id)
	 */
	private String c_id;
	private int cart_qty;
	private int cart_price;
	private Date cart_order_date;

	public Cart() {

	}

	public Cart(String p_id, String c_id, int cart_qty, int cart_price, Date cart_order_date) {
		this.p_id = p_id;
		this.c_id = c_id;
		this.cart_qty = cart_qty;
		this.cart_price = cart_price;
		this.cart_order_date = cart_order_date;
	}

	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public int getCart_qty() {
		return cart_qty;
	}

	public void setCart_qty(int cart_qty) {
		this.cart_qty = cart_qty;
	}

	public int getCart_price() {
		return cart_price;
	}

	public void setCart_price(int cart_price) {
		this.cart_price = cart_price;
	}

	public Date getCart_order_date() {
		return cart_order_date;
	}

	public void setCart_order_date(Date cart_order_date) {
		this.cart_order_date = cart_order_date;
	}

	@Override
	public String toString() {
		return "Cart [p_id=" + p_id + ", c_id=" + c_id + ", cart_qty=" + cart_qty + ", cart_price=" + cart_price
				+ ", cart_order_date=" + cart_order_date + "]";
	}

}
