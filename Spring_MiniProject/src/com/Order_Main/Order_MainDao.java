package com.Order_Main;

import java.util.ArrayList;

import com.frame.Dao;
import com.mapper.OrderMainMapper;
import com.vo.Order_Main;

public class Order_MainDao implements Dao<Integer, Order_Main> {

	OrderMainMapper cm;

	@Override
	public void insert(Order_Main v) {
		// TODO Auto-generated method stub
		cm.insert(v);
	}

	@Override
	public void delete(Order_Main v) {
		// TODO Auto-generated method stub
		cm.delete(v.getO_id());
	}

	@Override
	public void update(Order_Main v) {
		// TODO Auto-generated method stub
		cm.update(v);
	}

	@Override
	public Order_Main select(Integer k) {
		// TODO Auto-generated method stub
		return (Order_Main) cm.select(k);
	}

	@Override
	public ArrayList<Order_Main> select() {
		// TODO Auto-generated method stub
		return cm.selectall();
	}

}
