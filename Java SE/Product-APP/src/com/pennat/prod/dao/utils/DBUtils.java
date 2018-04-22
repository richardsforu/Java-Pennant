package com.pennat.prod.dao.utils;

import java.util.ArrayList;
import java.util.List;

import com.pennat.prod.model.Product;

public class DBUtils {

	private static List<Product> prods;

	private DBUtils() {
	}

	public static List<Product> getProductList() {
		if (prods == null)
			prods = new ArrayList<>();
		return prods;
	}

}
