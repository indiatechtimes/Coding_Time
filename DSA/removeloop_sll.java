public class removeloop_sll {// this will remove the loop from sll
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode (int data){
            this.data=data;
            this.next=null;
        }
    }
    public void creloop(){
        ListNode fir=new ListNode(1);
        ListNode sec=new ListNode(2);
        ListNode thi=new ListNode(3);
        ListNode fou=new ListNode(4);
        ListNode fiv=new ListNode(5);
        ListNode six=new ListNode(6);
        ListNode sev=new ListNode(7);
        ListNode eig=new ListNode(8);

        head=fir;
        fir.next=sec;
        sec.next=thi;
        thi.next=fou;
        fou.next=fiv;
        fiv.next=six;
        six.next=sev;
        sev.next=eig;
        eig.next=thi;



        
    }
    public void display(){
        ListNode curr=head;
        while (curr!=null) {
            System.out.print(curr.data+" -->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public ListNode reloop(){
        ListNode fas=head;
        ListNode slo=head;
        while (fas!=null&&fas.next!=null) {
            fas=fas.next.next;
            slo=slo.next;
            if(slo==fas){
                remove(slo);
                
            }
        }
        return slo;
        
    }
    public ListNode remove(ListNode slo){
        ListNode tem=head;
        while (tem.next!=slo.next) {
            tem=tem.next;
            slo=slo.next;
        }
        return slo.next=null;
        
    }


    public static void main(String[] args) {
        removeloop_sll s=new removeloop_sll();
        s.creloop();
        //s.display();
        s.reloop();
        s.display();
    }
}

