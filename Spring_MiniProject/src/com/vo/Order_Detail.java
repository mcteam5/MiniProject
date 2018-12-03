package com.vo;

public class Order_Detail {
	/**
	 * Order_Detail Table PK
	 */
	private int od_id;
	/**
	 * Product Table FK
	 */
	private String p_id;
	/**
	 * Order_Main Table FK
	 */
	private int o_id;
	private int od_qty;
	private int od_price;

	public Order_Detail() {

	}

	public Order_Detail(int od_id, String p_id, int o_id, int od_qty, int od_price) {
		this.od_id = od_id;
		this.p_id = p_id;
		this.o_id = o_id;
		this.od_qty = od_qty;
		this.od_price = od_price;
	}

	public int getOd_id() {
		return od_id;
	}

	public void setOd_id(int od_id) {
		this.od_id = od_id;
	}

	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	public int getO_id() {
		return o_id;
	}

	public void setO_id(int o_id) {
		this.o_id = o_id;
	}

	public int getOd_qty() {
		return od_qty;
	}

	public void setOd_qty(int od_qty) {
		this.od_qty = od_qty;
	}

	public int getOd_price() {
		return od_price;
	}

	public void setOd_price(int od_price) {
		this.od_price = od_price;
	}

	@Override
	public String toString() {
		return "Order_Detail [od_id=" + od_id + ", p_id=" + p_id + ", o_id=" + o_id + ", od_qty=" + od_qty
				+ ", od_price=" + od_price + "]";
	}

}
