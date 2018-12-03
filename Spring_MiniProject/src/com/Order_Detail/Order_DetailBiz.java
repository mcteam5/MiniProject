package com.Order_Detail;

import java.util.ArrayList;

import com.frame.Biz;
import com.frame.Dao;
import com.vo.Order_Detail;

public class Order_DetailBiz implements Biz<Integer, Order_Detail> {

	Dao dao;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void register(Order_Detail v) {
		// TODO Auto-generated method stub
		dao.insert(v);
	}

	@Override
	public void remove(Order_Detail v) {
		// TODO Auto-generated method stub
		dao.delete(v);
	}

	@Override
	public void modify(Order_Detail v) {
		// TODO Auto-generated method stub
		dao.update(v);
	}

	@Override
	public Order_Detail get(Integer k) {
		// TODO Auto-generated method stub
		return (Order_Detail) dao.select(k);
	}

	@Override
	public ArrayList<Order_Detail> get() {
		// TODO Auto-generated method stub
		return dao.select();
	}

}
