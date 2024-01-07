public class fmn_sll {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        /**
         * @param data
         */
        private ListNode (int data){
            this.data=data;
            this.next=null;


        }
    
    }
    public void insertfirst(int value){
        ListNode newNode =new ListNode(value);
        newNode.next=head;
        head=newNode;
    }

    public void middle(){
        ListNode current=head;
        int l=0;
        while (current!=null) {
            l=l++;
            
        }


        if (l%2==0) {
            int l1=(l+1)/2;
            ListNode current =head;
            while (current!=null) {
                System.out.println(current.data);
            }
            
        }
        else{
             int l1=(l/2)+1;
             ListNode current =head;
             while (current!=null) {
                if (current==l1) {
                    System.out.println(current.data);
                }
            }
        }
        
    }
    
    

    public static void main(String args[]){
        fmn_sll s=new fmn_sll();
        s.insertfirst(2);
        s.insertfirst(3);
        s.insertfirst(4);
        s.insertfirst(5);
        s.insertfirst(6);
        s.insertfirst(7);
        s.insertfirst(8);
        s.insertfirst(9);
        s.insertfirst(10);
        s.insertfirst(11);


        s.middle();

    }
    



}
