package ru.bystnik;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 4, 6, 4, 6, 87, 2, 1, 23, 234, 43, 5, 2, 1 };
		bublesort(arr);
	}

	private static void bublesort(int[] arr) {
		System.out.println("Unsorted: " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
				System.out.println("Step #" + i + "." + j + " " + Arrays.toString(arr));
			}
		}
		;
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
	}

}
