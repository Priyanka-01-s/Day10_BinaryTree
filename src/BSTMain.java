public class BSTMain {
    public static void main(String[] args){
        System.out.println("BINARY SEARCH TREE\n");
        BinaryTree<Integer> bst = new BinaryTree<>();

        bst.insert(56);
        bst.insert(30);
        bst.insert(70);

        System.out.println("THE INORDER TRAVERSAL :");
        bst.inOrderTraversal();


    }
}
