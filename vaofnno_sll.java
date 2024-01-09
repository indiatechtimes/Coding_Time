public class vaofnno_sll {// To find the value of nth node in SinglyLinkedList from starting
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
        ListNode curr=head;
        while (curr!=null) {
            System.out.print(curr.data+" -->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public void position(int x){
        if(head==null){
            System.out.println("No Node");

        }
        ListNode curr =head;
        int y=1;
        while (curr!=null) {
            if (y==x) {
                System.out.println(curr.data+" at "+x);
            }
            curr=curr.next;
            y++;
        }
    }


    public static void main(String args[]){
        vaofnno_sll s=new vaofnno_sll();
        s.insertfirst(2);
        s.insertfirst(4);
        s.insertfirst(6);
        s.insertfirst(8);
        s.insertfirst(1);
        s.insertfirst(2);
        s.insertfirst(5);
        s.insertfirst(10);
        s.display();


        s.position(2);



    }
}
