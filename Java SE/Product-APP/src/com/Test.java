package com;

import java.util.List;
import java.util.Scanner;

import com.pennat.prod.model.Product;
import com.pennat.prod.service.ProductService;
import com.pennat.prod.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ProductService prodService = new ProductServiceImpl();
		Product prod = null;

		while (true) {

			System.out.println("MENU");
			System.out.println("1.Add product");
			System.out.println("2.List Products");
			System.out.println("3.Find Product");
			System.out.println("4.Delete Product");
			System.out.println("5.Update Product");
			System.out.println("6.Back Up Data");
			System.out.println("7.Restore Data");
			System.out.println("8.Exit");
			System.out.println("Enter Choice: ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				Product p1 = new Product();
				p1.setProdId(10);
				p1.setProdName("Pen");
				p1.setPrice(9447);
				prodService.addProduct(p1);
				break;
			case 2:
				List<Product> prods = prodService.listProducts();
				Product.display(prods);
				break;
			case 3:
				prod = prodService.findProduct(10);
				if (prod != null) {
					System.out.println("Product Id: " + prod.getProdId());
					System.out.println("Prod Name: " + prod.getProdName());
					System.out.println("Price: " + prod.getPrice());
					System.out.println("-------------------------------");
				} else {
					System.out.println("product Id not found");
				}
				break;
			case 4:
				prodService.deleteProduct(10);
				System.out.println("Product id Deleted");
				break;
			case 5:
				Product p2 = new Product();
				p2.setProdId(11);
				p2.setProdName("Soap");
				p2.setPrice(1234);
				prodService.updateProduct(10, p2);

				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				System.exit(0);
			default:
				System.out.println("Invalid Choice. try again");
			}

		}

	}

}
