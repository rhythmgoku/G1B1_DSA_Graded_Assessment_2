package com.greatlearning.gradedproject2.assignment2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			BinarySearchTree binarySearchTree = new BinarySearchTree();
			Node root = null;
			Node result = null;

//			hard coding the data values to BST
			List<Integer> values = Arrays.asList(50, 30, 60, 10, 20, 55);

//			BST data population
			for (int i = 0; i < values.size(); i++) {
				int data = values.get(i);

				if (root == null)
					root = binarySearchTree.insertValue(root, data);
				else {
					result = binarySearchTree.insertValue(root, data);
					if (result.data == data)
						i -= 1;
				}
			}


//			printing BST
			System.out.println(" \n\n                      Printing BST in 2D                       \n ");
			System.out.println(" --------------------------------------------------------- \n\n");

			TreePrinterUtil.print2D(root);

			System.out.println(" \n\n --------------------------------------------------------- \n\n");

//			Performing Skewing logic
			SkewTree skewTree = new SkewTree();
			skewTree.inOrder(root);
			Node skewed = skewTree.skewingTree();
			
			
			System.out.println(" \n    Printing BST and Skewed BST (printStyle=Linear)                     \n\n ");
			
			
			System.out.println(" --------------------------------------------------------- \n\n");
		
			System.out.print("\n    Inorder :");
			TreeTraversal.inOrderTraversal(root);

			System.out.print("\n    Inorder Skewed :");
			TreeTraversal.inOrderTraversal(skewed);
			
			System.out.println(" \n\n --------------------------------------------------------- \n\n");


		} catch (Exception e) {
			System.out.println("Error Occured in the Floor Factory Process -- " + e);
		}
	}

}
