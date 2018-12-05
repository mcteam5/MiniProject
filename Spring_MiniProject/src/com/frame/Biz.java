package com.frame;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

public interface Biz<K, V> {
	@Transactional
	public void register(V v);

	@Transactional
	public void remove(V v);

	@Transactional
	public void modify(V v);

	public V get(K k);

	public ArrayList<V> get();


}
