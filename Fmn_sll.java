class fmn_sll {
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
            System.out.print(current.data+"-->");
            l++;

            current=current.next;
            
        }
        

        System.out.println(" ");
        System.out.println(l);


        if (l%2==0) {
            int l1=(l/2)+1;
            int k=1;
            ListNode current1 =head;
            while (current1!=null) {
                if (k==l1) {
                    System.out.println(current1.data+" is at middle");
                }

                k++;
                current1=current1.next;
                
            }
            
        }else{

            int l1=(l+1)/2;
            int k=1;
            ListNode current2 =head;
            while (current2!=null) {
                if (k==l1) {
                    System.out.println(current2.data+" is at middle ");

                }
                k++;
                current2=current2.next;
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
