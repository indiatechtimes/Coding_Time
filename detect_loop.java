public class detect_loop {// this Algorithm detect loop in Sll
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode (int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insert(int value){
        ListNode newNode =new ListNode(value);
        newNode.next=head;
        head=newNode;
    }


}
