package com.jbk.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.ProductDao;
import com.jbk.model.Product;
import com.jbk.service.ProductService;

@Service
public class ProductServiceIMPL implements ProductService {

	@Autowired
	private ProductDao dao;

	@Override
	public boolean saveProduct(Product product) {

		return dao.saveProduct(product);
	}

	@Override
	public Product getProductById(String productId) {

		return dao.getProductById(productId);
	}

	@Override
	public List<Product> getAllProduct() {
		return dao.getAllProduct();

	}

	@Override
	public boolean deleteProductById(String productId) {
		return dao.deleteProductById(productId);
	}

	@Override
	public boolean updateProduct(Product product) {
		return dao.updateProduct(product);
	}

}
