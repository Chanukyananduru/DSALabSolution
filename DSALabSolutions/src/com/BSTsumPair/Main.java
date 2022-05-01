package com.BSTsumPair;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter # elements you want in BST");
		int num_elements = sc.nextInt();
		
		BinarySearchTree tree = new BinarySearchTree();
		System.out.println("Enter the elements");
		for (int i = 0; i <num_elements; i++) {
			int element = sc.nextInt();
			tree.insert(element);
		}

		//Checking if there are a pair of values that add up to give the sum
		System.out.println("Enter the sum you want to check for:");
		int sum=sc.nextInt();
		sc.close();
		tree.PairCheck(tree.root,sum);

	}

}
