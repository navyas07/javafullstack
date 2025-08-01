package com.training.basic;

public class Greater {

	public static void main(String[] args) {
		//Greatest in an array
		int[] array= {567,1,234,566,488};
		System.out.println("Greatest number is "+greatest(array));;
	}

    static int greatest(int[] array) {
    	int greater = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > greater)
            	greater = array[i];

        return greater;
    }

}
