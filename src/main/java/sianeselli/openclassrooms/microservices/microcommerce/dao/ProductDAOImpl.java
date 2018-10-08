package sianeselli.openclassrooms.microservices.microcommerce.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import sianeselli.openclassrooms.microservices.microcommerce.model.Product;

@Repository
public class ProductDAOImpl implements ProductDao {
	
	public static List<Product> products= new ArrayList<Product>();
	
	static {
		products.add(new Product(1, "Aspirateur", 12));
		products.add(new Product(2, "PC", 120));
		products.add(new Product(3, "IPhone", 1200));
	}

	@Override
	public List<Product> findAll() {
		return products;
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
