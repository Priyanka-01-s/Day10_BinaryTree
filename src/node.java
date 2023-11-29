public class node< T extends Comparable<T>> {
    T data;
    node<T> left;
    node<T> right;

    // Constructor to create a new node
    public node(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
