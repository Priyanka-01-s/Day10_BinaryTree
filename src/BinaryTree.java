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
}
