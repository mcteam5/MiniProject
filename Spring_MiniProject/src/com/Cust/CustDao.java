package com.Cust;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.mapper.CustMapper;
import com.vo.Cust;

@Repository("cdao")
public class CustDao implements Dao<String, Cust> {

	@Autowired
	CustMapper cm;

	@Override
	public void insert(Cust v) {
		// TODO Auto-generated method stub
		cm.insert(v);
	}

	@Override
	public void delete(Cust v) {
		// TODO Auto-generated method stub
		cm.delete(v.getC_id());
	}

	@Override
	public void update(Cust v) {
		// TODO Auto-generated method stub
		cm.update(v);
	}

	@Override
	public Cust select(String k) {
		// TODO Auto-generated method stub
		return (Cust) cm.select(k);
	}

	@Override
	public ArrayList<Cust> select() {
		// TODO Auto-generated method stub
		return cm.selectall();
	}

}
