package sianeselli.openclassrooms.microservices.microcommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import sianeselli.openclassrooms.microservices.microcommerce.dao.ProductDao;
import sianeselli.openclassrooms.microservices.microcommerce.model.Product;

@RestController
public class ProductController {
	
	@Autowired
	private ProductDao productDao;
	
	//Produits/{id}
	@GetMapping(value="Produits/{id}")
	public Product afficherUnProduit(@PathVariable int id){
		return new Product(id, "aspirateur", 100);
	}
	
	
}
