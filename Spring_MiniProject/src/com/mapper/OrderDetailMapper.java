package com.mapper;

import java.util.ArrayList;

import com.vo.Order_Detail;

public interface OrderDetailMapper {
	public void insert(Order_Detail obj);

	public void delete(int od_id);

	public void update(Order_Detail obj);

	public Order_Detail select(int od_id);

	public ArrayList<Order_Detail> selectall();
}
