package edu.neu.anurag;

import java.util.ArrayList;
import java.util.List;

class ProductSearchImpl extends ProductSearch {
	private Cache cache;
    public ProductSearchImpl(SearchEngine searchEngine,Cache cache) {
        super(searchEngine);
        this.cache=cache;
    }

    @Override
    public List<Product> searchProducts(String query) {
    	if (this.cache.get(query)!=null)
    		return this.cache.get(query);
    	else {
    		this.cache.put(query, new ArrayList<>());
    		return searchEngine.search(query);
    	}
    }
}