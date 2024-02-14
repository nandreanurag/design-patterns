package edu.neu.anurag;

public class ClothingProduct extends Product {

	private ProductTypeEnum type;

	public ClothingProduct(int id, String name, String description, ProductTypeEnum type) {
		super(id, name, description);
		this.type = type;
	}

}
