package com.BSTsumPair;

import java.util.ArrayList;

class BinarySearchTree {

	Node root = null;

	void insert(int key) //To insert a value in a BST from main 
	{
		root = insertToBST(this.root, key); //To call the function that inserts record into BST. This way we can avoid to the root input from user for each element
	}

	Node insertToBST(Node root, int key)
	{

		/* If the tree is empty (initial condition), return a new node */
		if (root == null) {
			root = new Node(key); 
			return root;
		}

		/* If the tree has been formed, going down the tree */
		if (key < root.value)
			root.left = insertToBST(root.left, key); //Property of BST to insert of left of root if the input is less than root
		else if (key > root.value)
			root.right = insertToBST(root.right, key);//Property of BST to insert of right of root if the input is more than root

		return root;
	}

	ArrayList<Integer> BSTtoList(Node node, ArrayList<Integer> list)
	{
		// Base Case
		if (node == null)
			return list;
		//Recursively pushing the elements of BST to an array list. First, push the left side element and then the right side
		BSTtoList(node.left, list);
		list.add(node.value);
		BSTtoList(node.right, list);

		return list;
	}

	// method to check if Pair is present
	boolean PairCheck(Node node, int target)
	{
		
		ArrayList<Integer> blanklist = new ArrayList<>();
		ArrayList<Integer> BSTlist = BSTtoList(node, blanklist); 

		int top = 0; // Starting index of array2
		int bottom = BSTlist.size() - 1; // Ending index of array2

		while (top < bottom) {

			if (BSTlist.get(top) + BSTlist.get(bottom) == target) // Target Found!
			{
				System.out.println("Values found. Pair is (" + BSTlist.get(top) + "," + BSTlist.get(bottom) + ") ");
								
				return true;
			}

			if (BSTlist.get(top) + BSTlist.get(bottom) > target) // decrease end to move towards target
			{
				bottom--;
			}

			if (BSTlist.get(top) + BSTlist.get(bottom) < target) // increase start to move towards target
			{
				top++;
			}
		}

		System.out.println("No pair of values adding up to the given sum has been found!");
		return false;
	}
}

	