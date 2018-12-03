package com.mapper;

import java.util.ArrayList;

import com.vo.Cart;

public interface CartMapper {
	public void insert(Cart obj);

	public void delete(String p_id, String c_id);

	public void update(Cart obj);

	public Cart select(String cart_id);

	public ArrayList<Cart> selectall();
}
