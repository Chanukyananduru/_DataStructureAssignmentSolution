package com.gl.RightSkewedBST;

class BSTOperations{
	public Node node;
	public Node prevNode = null;
	public Node headNode = null;

	public void convertBSTtoSkewed(Node root)
	{
		// Checking if root is NULL
		if(root == null)
		{
			return;
		}
		// Recursively skewing the BST 
		
		convertBSTtoSkewed(root.left);
		
		Node rightNode = root.right;
		
		// Condition to check if the root Node of the skewed tree is not defined
		if(headNode == null)
			{
				headNode = root;
				root.left = null;
				prevNode = root;
			}
		else
			{
				prevNode.right = root;
				root.left = null;
				prevNode = root;
			}
	
		// Recursively skewing the right subtree
		
		convertBSTtoSkewed(rightNode);
			
	}
	// Function to print the right skewed tree recursively
	 void printRightBST(Node root)
	{
		if(root == null)
			{
				return;
			}
		System.out.print(root.value + " ");
		printRightBST(root.right);	
	}
}