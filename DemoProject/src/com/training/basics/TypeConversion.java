package com.training.basics;

public class TypeConversion {
	public static void main(String[] args) {
		// UpCasting
		int x = 77;
		long y = x * 2;
		double z = x + y;
		System.out.println(x + " " + y + " " + z);

		// DownCasting
		double g = 102.3;
		float s = (float) g;
		long v = (long) (s + g);
		int a = (int) v;

		System.out.println(s + " " + v + " " + a);

	}

}
