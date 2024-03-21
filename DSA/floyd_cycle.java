public class floyd_cycle {
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

    public boolean fc(){
        ListNode fas=head;
        ListNode slo=head;
        while (fas!=null&&fas.next!=null) {
            fas=fas.next.next;
            slo=slo.next;
            if (fas==slo) { 

                return s_node(slo);
            }

        }

        return false;
    }
    public ListNode s_node(ListNode slo){
        ListNode ptr head;
        while (ptr!=sl  ) {
            
        }
    }
}
