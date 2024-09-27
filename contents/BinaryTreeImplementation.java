package binarytree;

public class BinaryTreeImplementation {

    Node root;

    
    public void insert(int data) {
        root = insertRec(root, data);
    }

    
    public Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    
    public void inorder() {
        inorderRec(root);
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }

  
    public void preorder() {
        preorderRec(root);
    }

    public void preorderRec(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    
    public void postorder() {
        postorderRec(root);
    }

    public void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.println(root.data);
        }
    }

    
    public void delete(int data) {
        root = deleteRec(root, data);
    }

   
    public Node deleteRec(Node root, int data) {
       
        if (root == null) return root;

        
        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
       
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            
            root.data = minValue(root.right);

            
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    
    private int minValue(Node root) {
        int minVal = root.data;
        while (root.left != null) {
            root = root.left;
            minVal = root.data;
        }
        return minVal;
    }

    
    
}
class Node {
	int data;
   Node left, right;

   public Node(int data) {
       this.data = data;
       this.left = null;
       this.right = null;
       }

}

