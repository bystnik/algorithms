package ru.bystnik;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 100, 65, 3, 21, 55, 69, 231, 43, 21, 10, 1 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int lo, int hi) {
		if (lo < hi) {
			int partition = partition(arr, lo, hi);
			quickSort(arr, partition + 1, hi);
			quickSort(arr, lo, partition - 1);
		}
	}

	private static int partition(int[] arr, int lo, int hi) {
		int pivot = arr[hi];
		int index = lo;
		for (int i = lo; i < hi; i++) {
			if (arr[i] < pivot) {
				swap(arr, i, index);
				index++;
			}
		}
		swap(arr, index, hi);
		return index;
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

}
