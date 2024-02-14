package edu.neu.anurag;

import java.util.List;

abstract class ProductSearch {
	protected SearchEngine searchEngine;

    public ProductSearch(SearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public abstract List<Product> searchProducts(String query);
}
