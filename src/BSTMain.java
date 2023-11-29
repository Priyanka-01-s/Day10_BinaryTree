public class BSTMain {
    public static void main(String[] args){
        System.out.println("BINARY SEARCH TREE\n");
        BinaryTree<Integer> bst = new BinaryTree<>();

        bst.insert(56);
        bst.insert(30);
        bst.insert(70);
        bst.insert(22);
        bst.insert(40);
        bst.insert(60);
        bst.insert(95);
        bst.insert(11);
        bst.insert(65);
        bst.insert(3);
        bst.insert(16);
        bst.insert(63);
        bst.insert(67);

        System.out.println("THE INORDER TRAVERSAL :");
        bst.inOrderTraversal();

        int actualSize = 12;
        int expectedSize = bst.sizeTree();
        if (actualSize == expectedSize) {
            System.out.println("All elements are added.");
        } else {
            System.out.println("Some elements are missing.");
        }
        System.out.println("\nThe size of the tree :"+expectedSize);

        System.out.println("\nThe Height of the BST :"+bst.heightTree());
    }
}
