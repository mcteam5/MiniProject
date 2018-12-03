package com.vo;

import java.util.Date;

public class Cust {

	/**
	 * Cust TABLE PK
	 */
	private String c_id;
	private String c_name;
	private String c_pw;
	private String c_interest;
	private String c_sex;
	private int c_age;
	private Date c_signup_date;

	public Cust() {

	}

	public Cust(String c_id, String c_name, String c_pw, String c_interest, String c_sex, int c_age,
			Date c_signup_date) {
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_pw = c_pw;
		this.c_interest = c_interest;
		this.c_sex = c_sex;
		this.c_age = c_age;
		this.c_signup_date = c_signup_date;
	}

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_pw() {
		return c_pw;
	}

	public void setC_pw(String c_pw) {
		this.c_pw = c_pw;
	}

	public String getC_interest() {
		return c_interest;
	}

	public void setC_interest(String c_interest) {
		this.c_interest = c_interest;
	}

	public String getC_sex() {
		return c_sex;
	}

	public void setC_sex(String c_sex) {
		this.c_sex = c_sex;
	}

	public int getC_age() {
		return c_age;
	}

	public void setC_age(int c_age) {
		this.c_age = c_age;
	}

	public Date getC_signup_date() {
		return c_signup_date;
	}

	public void setC_signup_date(Date c_signup_date) {
		this.c_signup_date = c_signup_date;
	}

	@Override
	public String toString() {
		return "Cust [c_id=" + c_id + ", c_name=" + c_name + ", c_pw=" + c_pw + ", c_interest=" + c_interest
				+ ", c_sex=" + c_sex + ", c_age=" + c_age + ", c_signup_date=" + c_signup_date + "]";
	}

}