package com.mapper;

import java.util.ArrayList;

import com.vo.Product;

public interface ProductMapper {
	public void insert(Product obj);

	public void delete(String p_id);

	public void update(Product obj);

	public Product select(String p_id);

	public ArrayList<Product> selectall();
}
