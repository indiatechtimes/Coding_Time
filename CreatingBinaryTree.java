

public class CreatingBinaryTree {
    private TreeNode root;
    
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        private TreeNode(int data){
            this.data=data;
        }
    }

    public void CreatBTree(){
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

    public static void main(String[] args) {
        
    }
}
