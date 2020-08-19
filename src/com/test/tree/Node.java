package com.test.tree;

public class Node  implements Comparable<Node>{

	private Node left;

	private Node right;

	private int data;
	
	public Node() {
		
	}

	public Node(int data) {
		super();
		this.setData(data);
	}

	public Node getLeft() {
		return left;
	}

	public Node setLeft(Node left) {
		this.left = left;
		return this;
	}

	public Node getRight() {
		return right;
	}

	public Node setRight(Node right) {
		this.right = right;
		return this;
	}

	public int getData() {
		return data;
	}

	public Node setData(int data) {
		this.data = data;
		return this;
	}

	@Override
	public String toString() {
		return "Node [left=" + left + ", right=" + right + ", data=" + data + "]";
	}

	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
