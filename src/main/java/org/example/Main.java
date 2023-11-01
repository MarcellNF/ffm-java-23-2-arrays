package org.example;

public class Main {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		int[] numbers2 = {1, 2, 3, 4, 5};
		// i = i + 1 / i = i - 1;
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = i;
			System.out.println(numbers[i]);
		}
		System.out.println();
		for(int i = 0; i < numbers2.length; i++){
			System.out.println(numbers2[i]);
		}
		System.out.println();
		/*
		for (variable (laufvariable) : array welches durchlaufen werden soll){
			was soll mit den werten passieren
		}
		Geht jedes Element durch, von index 0 bis n
		 */
		for(Integer currywurst : numbers2){
			System.out.println(currywurst);
		}
		System.out.println();
		for(int i = numbers2.length-1; i >= 0; i--){
			System.out.println(numbers2[i]);
		}
	}
}