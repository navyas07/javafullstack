package com.oops.encap;
public class ProductMain {

	public static void main(String[] args) {

		Product product=new Product();
		product.setProductName("Mobile");
		product.setPrice(200);
		product.setExpired(false);
		product.setProductId(1);
		System.out.println(product.getProductId());
		System.out.println(product);
	}

}
