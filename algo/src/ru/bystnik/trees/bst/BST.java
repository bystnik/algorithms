package ru.bystnik.trees.bst;

import java.util.Comparator;

public class BST<T> {

	private Node<T> root;
	private Comparator<T> copmarator;

	public BST(Comparator<T> comparator) {
		this.copmarator = comparator;
	}

	void insert(T value) {
		insertNode(root, value);
	}

	private void insertNode(Node<T> node, T value) {
		if (root == null) {
			root = new Node<T>();
			root.setValue(value);
			return;
		}

		if (copmarator.compare(value, node.getValue()) == -1) {
			Node<T> leftNode = node.getLeft();
			if (leftNode == null) {
				leftNode = new Node<T>();
				leftNode.setValue(value);
				node.setLeft(leftNode);
			} else {
				insertNode(leftNode, value);
			}

		} else if (copmarator.compare(value, node.getValue()) == 1) {
			Node<T> rightNode = node.getRight();
			if (rightNode == null) {
				rightNode = new Node<T>();
				rightNode.setValue(value);
				node.setRight(rightNode);
			} else {
				insertNode(rightNode, value);
			}
		} else {
			node.setValue(value);
			return;
		}
	}

}
