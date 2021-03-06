package com.Cart;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.mapper.CartMapper;
import com.vo.Cart;

@Repository("cartdao")
public class CartDao implements Dao<String, Cart> {
	@Autowired
	CartMapper cm;

	@Override
	public void insert(Cart v) {
		// TODO Auto-generated method stub
		cm.insert(v);
	}

	@Override
	public void delete(Cart v) {
		// TODO Auto-generated method stub
		cm.delete(v.getP_id(), v.getC_id());
	}

	@Override
	public void update(Cart v) {
		// TODO Auto-generated method stub
		cm.update(v);
	}

	@Override
	public Cart select(String k) {
		// TODO Auto-generated method stub
		return (Cart) cm.select(k);
	}

	@Override
	public ArrayList<Cart> select() {
		// TODO Auto-generated method stub
		return cm.selectall();
	}

}
