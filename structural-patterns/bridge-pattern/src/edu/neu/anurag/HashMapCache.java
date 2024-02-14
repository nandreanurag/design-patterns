package edu.neu.anurag;

import java.util.*;

class HashMapCache implements Cache {
	private Map<String, List<Product>> cacheMap = new HashMap<>();

	@Override
	public List<Product> get(String key) {
		return cacheMap.get(key);
	}

	@Override
	public void put(String key, List<Product> value) {
		cacheMap.put(key, value);
	}
}
