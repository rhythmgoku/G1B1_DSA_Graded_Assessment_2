package assignment2;

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


//			printing BST before Skew
			System.out.println("printing BST before Skew ");
			TreePrinterUtil.print2D(root);

			System.out.println(" \n\n --------------------------------------------------------- \n\n");

//			Performing Skewing logic
			SkewTree skewTree = new SkewTree();
			skewTree.inOrder(root);
			Node skewed = skewTree.skewingTree();
			
			
//			printing BST after Skew
			System.out.println("printing BST after Skew ");
			TreePrinterUtil.print2D(skewed);

			System.out.print("\nInorder :");
			TreeTraversal.inOrderTraversal(root);

			System.out.print("\nInorder skewed:");
			TreeTraversal.inOrderTraversal(skewed);

		} catch (Exception e) {
			System.out.println("Error Occured in the Floor Factory Process -- " + e);
		}
	}

}
