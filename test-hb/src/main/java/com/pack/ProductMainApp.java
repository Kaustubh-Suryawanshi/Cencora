package com.pack;

import java.util.List;

import com.pack.product.Product;
import com.pack.product.productdao.ProductDao;

public class ProductMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductDao prdao=new ProductDao();
		Product pr=new Product("Pen", 34.45);
		
		prdao.ProductSave(pr);
		List<Product> prods=prdao.getProducts();
		prods.forEach(p->System.out.println(p));
	
	}

}
