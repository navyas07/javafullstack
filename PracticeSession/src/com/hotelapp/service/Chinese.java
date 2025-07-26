package com.hotelapp.service;

import java.util.Arrays;
import java.util.List;

public class Chinese implements IRestaurant {

	@Override
	public List<String> showMenu() {
		// TODO Auto-generated method stub
		return Arrays.asList("Noodles","Fried Rice","Momos");
	}

}
