package ru.bystnik;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		int[] arr = { 7, 5, 13, 65, 32, 12, 34, 1, 8, 1, 45, 12 };

		countingSort(arr);

		System.out.println(Arrays.toString(arr));

	}

	private static void countingSort(int[] arr) {
		int[] aux = new int[findMax(arr) + 1];
		for (int i = 0; i < arr.length; i++) {
			aux[arr[i]]++;
		}
		int k = 0;
		for (int i = 0; i < aux.length; i++) {
			for (int j = aux[i]; j > 0; j--) {
				arr[k] = i;
				k++;
			}
		}
	}

	private static int findMax(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

}
