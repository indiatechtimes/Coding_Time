public class preorder_Rec_BT {// Also known as Preorder recursive BinaryTree traversal
    private TreeNode root;

    private class  TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;


        private TreeNode(int data){
            this.data=data;

        }
    }
    public void CreateBTree(){
        TreeNode fir=new TreeNode(1);
        TreeNode sec=new TreeNode(2);
        TreeNode thi=new TreeNode(3);
        TreeNode fou=new TreeNode(4);
        TreeNode fiv=new TreeNode(5);
        

        root=fir;
        fir.left=sec;
        fir.right=thi;


        sec.left=fou;
        sec.right=fiv;


    }

    public void Preorder(TreeNode root){// printing the values of Binary tree with the help of preorder recursive treaversal
        if (root==null) {
            return;
        }
        System.out.print(root.data +" ");
        Preorder(root.left);
        Preorder(root.right);

    }


    













    public static void main(String[] args) {
        preorder_Rec_BT pvb=new preorder_Rec_BT();
        pvb.CreateBTree();
        pvb.Preorder(pvb.root);

    }



}
