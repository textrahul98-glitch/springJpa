package com.example.demo.model;

import org.springframework.data.jpa.domain.Specification;

public class ProductSpecification {

	public static Specification<Product> nameLike(String name) {

		return (root, query, builder) -> builder.like(root.get("name"), "%" + name + "%");

	}

	public static Specification<Product> priceGreaterThan(Double price) {
		return (root, query, builder) -> builder.greaterThan(root.get("price"), price);

	}

	public static Specification<Product> priceLessThan(Double price) {
		return (root, query, builder) -> builder.lessThan(root.get("price"), price);

	}

}
