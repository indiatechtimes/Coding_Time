class detect_loop {// this Algorithm detect loop in Sll
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        /**
         * @param data
         */
        private ListNode (int data){
            this.next=null;
        }
    }
    // public void detect(){
    //     ListNode fas=head;
    //     ListNode slo=head;
    //     while (fas!=null&&fas.next!=null) {
    //         fas=fas.next.next;
    //         slo=slo.next;
    //         if (fas==slo) {
    //             System.out.println("It contain Loop");
    //             break;


    //         }

    //     }
    //     System.out.println("It does not contain Loop");
    //}
    public boolean detect(){
        ListNode fas=head;
        ListNode slo=head;
        while (fas!=null&&fas.next!=null) {
            fas=fas.next.next;
            slo=slo.next;
            if (fas==slo) { 

                return true;
            }

        }

        return false;
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
        //eig.next=thi;



        
    }
    public static void main(String args[]){
        detect_loop s=new detect_loop();
        s.creloop();
        s.detect();     



    }


}
