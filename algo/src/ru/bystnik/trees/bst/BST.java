package ru.bystnik.trees.bst;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

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

	public Node<T> getRoot() {
		return root;
	}

	public void printOutBST() {
		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		queue.add(root);
		queue.add(null);
		while (!queue.isEmpty()) {
			Node<T> curNode = queue.poll();
			if (curNode == null) {
				System.out.println("");
				if (queue.isEmpty())
					break;
				queue.add(null);
				continue;
			}

			System.out.print(curNode.getValue() + " ");

			Node<T> left = curNode.getLeft();
			Node<T> right = curNode.getRight();

			if (left != null)
				queue.add(left);
			if (right != null)
				queue.add(right);
		}
	}

}
