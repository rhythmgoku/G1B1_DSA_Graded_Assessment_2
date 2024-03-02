package assignment2;

public class BinarySearchTree {
	public Node insertValue(Node root, int data) {
		Node newNode = new Node(data);
		Node x = root;
		Node y = null; // y maintains pointer to x

		while (x != null) {
			y = x;
			if (data < x.data)
				x = x.left;
			else if (data > x.data)
				x = x.right;
			else {
				System.out.println("Value already exists!");
				return newNode;
			}
		}
		if (y == null)
			y = newNode;
		else if (data < y.data)
			y.left = newNode;
		else
			y.right = newNode;
		return y;

	}
}
