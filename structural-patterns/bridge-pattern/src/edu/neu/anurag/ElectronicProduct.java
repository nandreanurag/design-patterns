package edu.neu.anurag;

public class ElectronicProduct extends Product {
	
	private ProductTypeEnum type;

	public ElectronicProduct(int id,String name,String description,ProductTypeEnum type) {
		super(id, name, description);
		this.type=type;
	}

}
