package assignment2;

public class TreeTraversal {

	public static void inOrderTraversal(Node root) {
		
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.data + ",");
			inOrderTraversal(root.right);
		}
	}
}
