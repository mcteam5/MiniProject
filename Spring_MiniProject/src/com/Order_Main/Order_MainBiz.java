package com.Order_Main;

import java.util.ArrayList;

import com.frame.Biz;
import com.frame.Dao;
import com.vo.Order_Main;

public class Order_MainBiz implements Biz<Integer, Order_Main> {

	Dao dao;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void register(Order_Main v) {
		// TODO Auto-generated method stub
		dao.insert(v);
	}

	@Override
	public void remove(Order_Main v) {
		// TODO Auto-generated method stub
		dao.delete(v);
	}

	@Override
	public void modify(Order_Main v) {
		// TODO Auto-generated method stub
		dao.update(v);
	}

	@Override
	public Order_Main get(Integer k) {
		// TODO Auto-generated method stub
		return (Order_Main) dao.select(k);
	}

	@Override
	public ArrayList<Order_Main> get() {
		// TODO Auto-generated method stub
		return dao.select();
	}

}
