package com.hotelapp.main;

import java.util.List;
import java.util.Scanner;

import com.hotelapp.service.Chinese;
import com.hotelapp.service.IRestaurant;
import com.hotelapp.service.Indian;
import com.hotelapp.service.Italian;

public class Customer {

	public static void main(String[] args) {
		// get user input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice -c/in/it");
		String choice = sc.next();
		IRestaurant restaurant = null;
		switch (choice.toUpperCase()) {
		case "C":
			restaurant = new Chinese();
			break;
		case "IN":
			restaurant = new Indian();
			break;
		case "IT":
			restaurant = new Italian();
			break;
		default:
			System.out.println("Wrong choice");
		}
		if (restaurant != null) {
			List<String> menu = restaurant.showMenu();
			System.out.println(menu);
		}
		sc.close();
	}

}
