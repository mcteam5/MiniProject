package com.Order_Detail;

import java.util.ArrayList;

import com.frame.Dao;
import com.mapper.OrderDetailMapper;
import com.vo.Order_Detail;

public class Order_DetailDao implements Dao<Integer, Order_Detail> {

	OrderDetailMapper cm;

	@Override
	public void insert(Order_Detail v) {
		// TODO Auto-generated method stub
		cm.insert(v);
	}

	@Override
	public void delete(Order_Detail v) {
		// TODO Auto-generated method stub
		cm.delete(v.getOd_id());
	}

	@Override
	public void update(Order_Detail v) {
		// TODO Auto-generated method stub
		cm.update(v);
	}

	@Override
	public Order_Detail select(Integer k) {
		// TODO Auto-generated method stub
		return (Order_Detail) cm.select(k);
	}

	@Override
	public ArrayList<Order_Detail> select() {
		// TODO Auto-generated method stub
		return cm.selectall();
	}

}
