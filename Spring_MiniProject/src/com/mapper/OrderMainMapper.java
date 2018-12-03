package com.mapper;

import java.util.ArrayList;

import com.vo.Order_Main;

public interface OrderMainMapper {
	public void insert(Order_Main obj);

	public void delete(int o_id);

	public void update(Order_Main obj);

	public Order_Main select(int o_id);

	public ArrayList<Order_Main> selectall();
}
