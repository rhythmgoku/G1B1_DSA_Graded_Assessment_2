package assignment2;


public class TreePrinterUtil {
    private static final int COUNT = 8;
    
    public static void print2DUtil(Node root, int space)
    {
        // Base case
        if (root == null)
            return;
 
        // Increase distance between levels
        space += COUNT;
 
        // Process right child first
        print2DUtil(root.right, space);
 
        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.data + "\n");
 
        // Process left child
        print2DUtil(root.left, space);
    }
    
    public static void print2D(Node root)
    {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }

}
