package com.test.tree;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BinaryTree {

	Node root = null;
	Node current = null;
	Queue<Node> queue = new LinkedList<>();
	
	public BinaryTree() {
	}
	
	
	public void add(int data) {
			current	= add(current,data);
	}


	private Node add(Node current2,int data) {
		
		if(null == current2) {
			Node node = new Node(data);
			queue.add(node);
			return  node;
		} else {
			Node node =queue.peek();
			if(null == node.getLeft()) {
				Node left = new Node(data);
				node.setLeft(left);
				queue.add(left);
			} else if(null == node.getRight()) {
				Node right = new Node(data);
				node.setRight(right);
				queue.add(right);
				queue.poll();
			}
			
		}
		
		return current2;
	}


	@Override
	public String toString() {
		return "BinaryTree [root=" + root + ", current=" + current + ", queue=" + queue + "]";
	}
	
	
}
