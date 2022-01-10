import javax.print.event.PrintJobListener;

public class trees {
    private TreeNode root;
    

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;


        public TreeNode(int data){
            this.data = data;
        }
    }


    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth= new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);


        root = first;        // root ---> first
        first.left = second;  
        first.right = third;


        second.left = fourth;
        second.right = fifth;

        third.left  = sixth;
        third.right = seventh;

    }

    // Recursive PreOrder traversal of a Binary Tree in Java

    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);

    }


    // Recursive Inorder traversal of Binary Tree in Java


    public void Inorder(TreeNode root){
        if(root == null){
            return;
        }
        preOrder(root.left);
        System.out.println(root.data+ " ");
        preOrder(root.right);

    }

// Recursive Postorder traversal of a Binary Tree in Java
    
    public void Postorder(TreeNode root){
        if(root == null){
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.println(root.data+ " ");

    }



    public static void main(String[] args) {
        
    }
}
