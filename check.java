public class postorder_Rec_BT {

    
    private TreeNode root;
    
    private class TreeNode{
        
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
        TreeNode six=new TreeNode(6);
        

        root=fir;
        fir.left=sec;
        fir.right=thi;


        sec.left=fou;
        sec.right=fiv;
        thi.left=six;


    } 


    public void postorder(TreeNode root){
        if (root==null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
        
        
 
    }

    public int treeLenght(TreeNode root){
        if (root==null) {
            return 0;

        }
        int lenL=treeLenght(root.left);
        int lenR=treeLenght(root.right);
        return 1+lenL+lenR;
    }


 
    public static void main(String[] args) {
        postorder_Rec_BT pr=new postorder_Rec_BT();
        pr.CreateBTree();
        pr.postorder(pr.root);
        System.out.println("length of tree is: "+pr.treeLenght(pr.root));

        
    }
}
