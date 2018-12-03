package com.Cust;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;
import com.vo.Cust;

@Service("cbiz")
public class CustBiz implements Biz<String, Cust> {

	@Resource(name = "cdao")
	Dao dao;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void register(Cust v) {
		// TODO Auto-generated method stub
		dao.insert(v);
	}

	@Override
	public void remove(Cust v) {
		// TODO Auto-generated method stub
		dao.delete(v);

	}

	@Override
	public void modify(Cust v) {
		// TODO Auto-generated method stub
		dao.update(v);
	}

	@Override
	public Cust get(String k) {
		// TODO Auto-generated method stub
		return (Cust) dao.select(k);
	}

	@Override
	public ArrayList<Cust> get() {
		// TODO Auto-generated method stub
		return dao.select();
	}

}
