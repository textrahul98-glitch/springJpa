package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.demo.EmployeeRepo.ProductRepo;
import com.example.demo.model.Product;
import com.example.demo.model.ProductSpecification;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;

	/*
	 * public void saveProduct() { Product p= new Product(); p.setId(101);
	 * p.setName("onePlus"); p.setCategory("nod5"); p.setPrice(5000.25);
	 * productRepo.save(p);
	 * 
	 * }
	 */
	// name , price (less and greater)
	public List<Product> getProductBySpecification(String name, Double lessPrice, Double greaterPrice) {
		Specification<Product> spec = null;
		if (name != null && !name.isEmpty()) {
			spec = ProductSpecification.nameLike(name);
		}

		if (lessPrice != null) {
			Specification<Product> priceLess = ProductSpecification.priceLessThan(lessPrice);

			spec = (spec == null) ? priceLess : spec.and(priceLess);
		}

		if (greaterPrice != null) {
			Specification<Product> priceGreater = ProductSpecification.priceGreaterThan(greaterPrice);

			spec = (spec == null) ? priceGreater : spec.and(priceGreater);
		}

		return productRepo.findAll(spec);

	}

}
