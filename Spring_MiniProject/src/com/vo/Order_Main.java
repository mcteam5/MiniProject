package com.vo;

public class Order_Main {
	/**
	 * Order_Main Table PK
	 */
	private int o_id;
	/**
	 * Cust Table FK
	 */
	private String c_id;
	private int o_qty;
	private int o_total_price;
	private String o_status;

	public Order_Main() {

	}

	public Order_Main(int o_id, String c_id, int o_qty, int o_total_price, String o_status) {
		this.o_id = o_id;
		this.c_id = c_id;
		this.o_qty = o_qty;
		this.o_total_price = o_total_price;
		this.o_status = o_status;
	}

	public int getO_id() {
		return o_id;
	}

	public void setO_id(int o_id) {
		this.o_id = o_id;
	}

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public int getO_qty() {
		return o_qty;
	}

	public void setO_qty(int o_qty) {
		this.o_qty = o_qty;
	}

	public int getO_total_price() {
		return o_total_price;
	}

	public void setO_total_price(int o_total_price) {
		this.o_total_price = o_total_price;
	}

	public String getO_status() {
		return o_status;
	}

	public void setO_status(String o_status) {
		this.o_status = o_status;
	}

	@Override
	public String toString() {
		return "Order_Main [o_id=" + o_id + ", c_id=" + c_id + ", o_qty=" + o_qty + ", o_total_price=" + o_total_price
				+ ", o_status=" + o_status + "]";
	}

}