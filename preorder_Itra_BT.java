import java.util.Stack;

public class preorder_Itra_BT {
    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        private TreeNode(int data){
            this.data=data;
        }
    }


    public void creBTree(){
        TreeNode fir=new TreeNode(1);
        TreeNode sec=new TreeNode(2);
        TreeNode thi=new TreeNode(3);
        TreeNode fou=new TreeNode(4);
        TreeNode fiv=new TreeNode(5);
        TreeNode six=new TreeNode(6);
        TreeNode sev=new TreeNode(7);
        TreeNode eig=new TreeNode(8);
        TreeNode nin=new TreeNode(9);



        root=fir;
        fir.left=sec;
        fir.right=thi;
        
        sec.left=fou;
        sec.right=fiv;

        fiv.left=eig;
        fiv.right=nin;

        thi.left=six;
        thi.right=sev;



    }

    public void preorder(){
        if (root==null) {
            return;

        }
        Stack<TreeNode>stack=new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp=stack.pop();
            System.out.print(temp.data+" ");

            if (temp.right!=null) {
                stack.push(temp.right);
            }
            if (temp.left!=null) {
                stack.push(temp.left);
            }
        }
    }



    public static void main(String[] args) {
        
        preorder_Itra_BT pib=new preorder_Itra_BT();
        pib.creBTree();
        pib.preorder();
    }



    
}
