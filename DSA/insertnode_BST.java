

public class insertnode_BST {
    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
        private TreeNode(int data){
            this.data=data;
        }
    }
    public void insert(int value){
        root=insert(root,value);
    }

    public TreeNode insert(TreeNode root,int value){
        if (root==null) {
            root =new TreeNode(value);
            return root;
        }
        if (value<root.data) {
            root.left=insert(root.left, value);
        }else{
            root.right=insert(root.right, value);

        }
        return root;
    }

    public void inorder(){
        inorder(root);
    }
    public void inorder(TreeNode root){
        if (root==null) {
            return;

        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String args[]){
        insertnode_BST i=new insertnode_BST();
        i.insert(5);
        i.insert(3);
        i.insert(7);
        i.insert(1);

        i.inorder();
    }





}
