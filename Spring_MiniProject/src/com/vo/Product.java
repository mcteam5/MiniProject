package com.vo;

import java.util.Date;

public class Product {
	/**
	 * Product Table PK
	 */
	private String p_id;
	private String p_name;
	private int p_price;
	private String p_brand;
	private String p_main_category;
	private String p_small_category;
	private String p_img;
	private int p_qty;
	private Date p_reg_date;

	public Product() {

	}

	public Product(String p_id, String p_name, int p_price, String p_brand, String p_main_category,
			String p_small_category, String p_img, int p_qty, Date p_reg_date) {
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_brand = p_brand;
		this.p_main_category = p_main_category;
		this.p_small_category = p_small_category;
		this.p_img = p_img;
		this.p_qty = p_qty;
		this.p_reg_date = p_reg_date;
	}

	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public String getP_brand() {
		return p_brand;
	}

	public void setP_brand(String p_brand) {
		this.p_brand = p_brand;
	}

	public String getP_main_category() {
		return p_main_category;
	}

	public void setP_main_category(String p_main_category) {
		this.p_main_category = p_main_category;
	}

	public String getP_small_category() {
		return p_small_category;
	}

	public void setP_small_category(String p_small_category) {
		this.p_small_category = p_small_category;
	}

	public String getP_img() {
		return p_img;
	}

	public void setP_img(String p_img) {
		this.p_img = p_img;
	}

	public int getP_qty() {
		return p_qty;
	}

	public void setP_qty(int p_qty) {
		this.p_qty = p_qty;
	}

	public Date getP_reg_date() {
		return p_reg_date;
	}

	public void setP_reg_date(Date p_reg_date) {
		this.p_reg_date = p_reg_date;
	}

	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", p_name=" + p_name + ", p_price=" + p_price + ", p_brand=" + p_brand
				+ ", p_main_category=" + p_main_category + ", p_small_category=" + p_small_category + ", p_img=" + p_img
				+ ", p_qty=" + p_qty + ", p_reg_date=" + p_reg_date + "]";
	}

}
