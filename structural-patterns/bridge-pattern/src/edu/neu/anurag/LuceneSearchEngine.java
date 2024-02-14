package edu.neu.anurag;

import java.util.ArrayList;
import java.util.List;

public class LuceneSearchEngine implements SearchEngine{

	@Override
    public List<Product> search(String query) {
		System.out.println("Searching "+ query+" using Lucene: ");
        return new ArrayList<>();
    }
}
