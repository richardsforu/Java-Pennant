package com.pennat.prod.dao;

import java.util.List;
import java.util.ListIterator;

import com.pennat.prod.dao.utils.DBUtils;
import com.pennat.prod.model.Product;

public class ProductDaoImpl implements ProductDao {

	private List<Product> prods;

	@Override
	public void addProduct(Product prod) {
		prods = DBUtils.getProductList();
		prods.add(prod);
	}

	@Override
	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		return DBUtils.getProductList();
	}

	@Override
	public Product findProduct(int prodId) {

		Product product = null;
		for (Product prod : DBUtils.getProductList()) {
			if (prod.getProdId() == prodId) {
				product = prod;
				break;
			}
		}
		return product;
	}

	@Override
	public void deleteProduct(int prodId) {
		ListIterator<Product> li = DBUtils.getProductList().listIterator();

		while (li.hasNext()) {
			Product prod = li.next();
			if (prod.getProdId() == prodId) {
				li.remove();
				break;
			}
		}

	}

	@Override
	public void updateProduct(int prodId, Product newProd) {
		ListIterator<Product> li = DBUtils.getProductList().listIterator();
		while (li.hasNext()) {
			Product prod = li.next();
			if (prod.getProdId() == prodId) {
				li.set(newProd);
			}

		}

	}

}
