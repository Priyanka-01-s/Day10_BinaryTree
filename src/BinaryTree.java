public class BinaryTree<T extends Comparable<T>> {

    node<T> root;
    // Constructor for an empty binary tree.
    public BinaryTree(){
        this.root =null;
    }

    public void insert(T data){
        root = insertRec(root,data);
    }
    
    //inserting the smaller element to the left side of the tree and the larger element ti the right side of the tree
    private node<T> insertRec(node<T> root, T data){

        if(root== null){
            root = new node<>(data);
            return root;
        }
        //using compareTo method from Comparable interface to check the larger elemrnt
        //-ve valeues if less , 0 if equal and +ve if greater value
        if(data.compareTo(root.data)>0){
            root.right = insertRec(root.right,data);
        }else if(data.compareTo(root.data)<0){
            root.left = insertRec(root.left, data);
        }
        return root;

    }

    // displaying the tree in a inorder traversal method`
    public void inOrderTraversal(){
        inorderTraversal(root);
        
    }
    private  void inorderTraversal(node<T> root){
        //left root right
        if(root!=null){
            inorderTraversal(root.left);
            System.out.print(root.data+ " ");
            inorderTraversal(root.right);
        }      
    }

    //calculating the size of the tree or the number of nodes int the tree
    public int sizeTree(){
        return size(root);
    }

    private int size(node<T> root){
        if(root == null){
            return 0;
        }
        int leftSize = size(root.left);
        int rightSize = size(root.right);
        //adding the right+left node elemnents + 1 for main root
        return leftSize+rightSize+1;

    }

    //calculating the height of the tree 

    public int heightTree(){
        return height(root);
    }
    private int height(node<T> root){
        if(root ==null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        //using math.max function for finding the max height of either of the subtree +1 for the main root element
        return Math.max(leftHeight, rightHeight)+1;
    }

    //For searching elements in tree
    public boolean searchElement(T data){
        return search(root, data);
    }
    
    private boolean search(node<T> root, T data){
        if(root == null){
            return false;
        }
        if(root.data.equals(data)){
            return true;
        }
        if(data.compareTo(root.data) < 0){
            return search(root.left,data);
        }else{
            return search(root.right,data);
        }

    }
}
