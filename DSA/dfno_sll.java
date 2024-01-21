public class dfno_sll {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        ListNode current=head;
        while (current!=null) {
            System.out.print(current.data+" -->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void insertfirst(int value){
        ListNode newNode= new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    public ListNode deletefirst(){
        if (head==null) {
            System.out.print("null");

        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return temp;

    }
    public static void main(String args[]){
        dfno_sll s=new dfno_sll();
        s.insertfirst(2);
        s.insertfirst(4);
        s.insertfirst(6);
        s.insertfirst(8);
        s.insertfirst(10);
        s.insertfirst(12);

        s.display();
        s.deletefirst();
        s.display();
        s.deletefirst();
        s.display();
        s.deletefirst();
        s.display();
        s.deletefirst();
        s.display();
        s.deletefirst();
        s.display();
        s.deletefirst();
        s.display();
        

    }
    
}
