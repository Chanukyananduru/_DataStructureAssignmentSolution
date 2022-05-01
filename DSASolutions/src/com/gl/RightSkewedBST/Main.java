package com.gl.RightSkewedBST;

public class Main {

	public static void main(String[] args) {
		// package com.gl.SkewedBST;		
			BSTOperations BST = new BSTOperations();
			BST.node = new Node(50);
			BST.node.left = new Node(30);
			BST.node.right = new Node(60);
			BST.node.left.left = new Node(10);
			BST.node.right.left= new Node(55);	
			BST.convertBSTtoSkewed(BST.node);
			BST.printRightBST(BST.headNode);
		

	}

}
