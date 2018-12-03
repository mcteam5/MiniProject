package com.Product;

import java.util.ArrayList;

import com.frame.Dao;
import com.mapper.ProductMapper;
import com.vo.Product;

public class ProductDao implements Dao<String, Product> {

	ProductMapper cm;

	@Override
	public void insert(Product v) {
		// TODO Auto-generated method stub
		cm.insert(v);
	}

	@Override
	public void delete(Product v) {
		// TODO Auto-generated method stub
		cm.delete(v.getP_id());
	}

	@Override
	public void update(Product v) {
		// TODO Auto-generated method stub
		cm.update(v);
	}

	@Override
	public Product select(String k) {
		// TODO Auto-generated method stub
		return (Product) cm.select(k);
	}

	@Override
	public ArrayList<Product> select() {
		// TODO Auto-generated method stub
		return cm.selectall();
	}

}
