public class innobe_sll {// innobe == insert node at the begening of the SinglyLinked list;u nnn
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




    public void length(){
        if (head==null) {
            System.out.print("length of SinglyLinkedList= 0"); 
        }
        int count=0;
        ListNode current=head;
        while (current!=null) {
            count++;
            current=current.next;
        }
        System.out.println("Length of SinglyLinkedList= "+count);
    }




    public void insertfirst(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }




    public static void main(String[] args) {
        innobe_sll s=new innobe_sll();
        s.insertfirst(2);
        s.insertfirst(4);
        s.insertfirst(6);
        s.insertfirst(8);
        s.insertfirst(10);
        s.insertfirst(12);
        s.insertfirst(14);


        s.display();
        s.length();
    }




    
}
