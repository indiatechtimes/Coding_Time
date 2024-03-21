public class dlno_sll {// Delete last node of Sinsly Linked List
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode(int data){
            this.data=data;
            this.next=null;

        }
    }
    public void insertfirst(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;

    }

    public void display(){
        ListNode current=head;
        while (current!=null) {
            System.out.print(current.data+" -->");
            current=current.next;

            
        }
        System.out.println("null");

    }

    public ListNode deletelast(){
        if (head==null||head.next==null) {
            return head;

            
        }
        ListNode current=head;
        ListNode privious=null;
        while (current.next!=null) {
            privious=current;
            current=current.next;
            
        }
        privious.next=null;
        return current;



    }
    public static void main(String args[]){
        dlno_sll s=new dlno_sll();
        s.display();
        s.insertfirst(2);
        s.insertfirst(4);
        s.insertfirst(6);
        s.insertfirst(8);
        s.insertfirst(10);
        s.insertfirst(12);
        s.display();
        s.deletelast();
        s.display();
        s.deletelast();
        s.display();
        s.deletelast();
        s.display();

    }

    
}
