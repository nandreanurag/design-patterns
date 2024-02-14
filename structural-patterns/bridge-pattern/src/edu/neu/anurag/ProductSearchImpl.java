package edu.neu.anurag;

import java.util.List;

class ProductSearchImpl extends ProductSearch {
    public ProductSearchImpl(SearchEngine searchEngine) {
        super(searchEngine);
    }

    @Override
    public List<Product> searchProducts(String query) {
        return searchEngine.search(query);
    }
}