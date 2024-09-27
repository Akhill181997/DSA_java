package binarytree;



public class BinaryTreeMain {
    public static void main(String[] args) {
        
        BinaryTreeImplementation bt = new BinaryTreeImplementation();

      
        bt.insert(50);
        bt.insert(30);
        bt.insert(20);
        bt.insert(40);
        bt.insert(70);
        bt.insert(60);
        bt.insert(80);

        
        System.out.println("Inorder traversal:");
        bt.inorder();

        
        System.out.println("Preorder traversal:");
        bt.preorder();

       
        System.out.println("Postorder traversal :");
        bt.postorder();

        
        System.out.println("Deleting node with value 20");
        bt.delete(20);

        
        System.out.println("Inorder traversal after deleting 20:");
        bt.inorder();

       
        
    }
}



