package sianeselli.openclassrooms.microservices.microcommerce.dao;

import java.util.List;

import sianeselli.openclassrooms.microservices.microcommerce.model.Product;

public interface ProductDao {
	
	public List<Product> findAll();
	
	public Product findById(int id);
	
	public Product save(Product product);

}
