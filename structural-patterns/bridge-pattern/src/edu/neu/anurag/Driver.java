package edu.neu.anurag;

public class Driver {

	public static void main(String[] args) {
		SearchEngine elasticSearchEngine = new ElasticSearchEngine();
		SearchEngine luceneSearchEngine = new LuceneSearchEngine();
		ProductTypeEnum searchType = ProductTypeEnum.CLOTHING_FASHION;
		Product laptop = new ElectronicProduct(1, "Laptop", "Hp Laptop", ProductTypeEnum.ELECTRONICS);
		Product mobile = new ElectronicProduct(2, "Mobile", "Pixel 8", ProductTypeEnum.ELECTRONICS);

		Product tshirt = new ClothingProduct(3, "Levis Tshirt", "Tshirt", ProductTypeEnum.CLOTHING_FASHION);
		Product shoe = new ClothingProduct(4, "Nike Shoe", "Shoe", ProductTypeEnum.CLOTHING_FASHION);
		ProductSearch productSearch;
		if(searchType==ProductTypeEnum.ELECTRONICS) {
			productSearch = new ProductSearchImpl(elasticSearchEngine);
			productSearch.searchProducts("Laptop");
		}else if(searchType==ProductTypeEnum.CLOTHING_FASHION) {
			productSearch = new ProductSearchImpl(luceneSearchEngine);
			productSearch.searchProducts("Laptop");
		}
        
	}
}

