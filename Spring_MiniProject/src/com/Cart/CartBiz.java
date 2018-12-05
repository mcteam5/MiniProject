package com.Cart;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;
import com.vo.Cart;

@Service("cartbiz")
public class CartBiz implements Biz<String, Cart> {
	@Resource(name = "cartdao")
	Dao dao;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void register(Cart v) {
		// TODO Auto-generated method stub
		dao.insert(v);
	}

	@Override
	public void remove(Cart v) {
		// TODO Auto-generated method stub
		dao.delete(v);
	}

	@Override
	public void modify(Cart v) {
		// TODO Auto-generated method stub
		dao.update(v);
	}

	@Override
	public Cart get(String k) {
		// TODO Auto-generated method stub
		return (Cart) dao.select(k);
	}

	@Override
	public ArrayList<Cart> get() {
		// TODO Auto-generated method stub
		return dao.select();
	}

}
