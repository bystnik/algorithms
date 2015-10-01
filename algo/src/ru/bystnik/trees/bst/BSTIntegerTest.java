package ru.bystnik.trees.bst;

import java.util.Comparator;

public class BSTIntegerTest {

	public static void main(String[] args) {
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				if (i1 < i2) {
					return -1;
				} else if (i1 > i2) {
					return 1;
				}
				return 0;
			}
		};
		BST<Integer> bst = new BST<Integer>(comparator);
		bst.insert(6);
		bst.insert(2);
		bst.insert(8);
		bst.insert(7);
		bst.insert(10);
		bst.insert(11);
		bst.insert(12);
		bst.insert(2);
		bst.insert(1);
		bst.insert(3);
		bst.insert(4);
		bst.insert(5);
		
		
		bst.printOutBST();

	}

}
