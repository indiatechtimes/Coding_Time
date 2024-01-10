public class reke {// this Algorithm is for remove the given key (element ) from SLL
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
    
    public void display(){
        ListNode curr=head;
        while (curr!=null) {
            System.out.print(curr.data+" -->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public void remove(int key){
        if(head==null){
            System.out.println("No Node");
        }
        ListNode cu=head;
        ListNode tem=null;
        while (cu!=null&&cu.data!=key) {
            tem=cu;
            cu=cu.next;
        }
        tem.next=cu.next;
        return remove;
        

    }

    public static void main(String args[]){
        reke s=new reke();
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


        s.display();
        s.remove(6);

    }

}
