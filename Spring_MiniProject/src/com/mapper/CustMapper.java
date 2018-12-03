package com.mapper;

import java.util.ArrayList;

import com.vo.Cust;

public interface CustMapper {
	public void insert(Cust obj);

	public void delete(String c_id);

	public void update(Cust obj);

	public Cust select(String c_id);

	public ArrayList<Cust> selectall();
}
