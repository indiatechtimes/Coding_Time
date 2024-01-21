public class mertwosor_sll {//this algorithm merge two sorted sll
    private ListNode head;
    private mertwosor_sll.ListNode lino1;
    private mertwosor_sll.ListNode lino2;
    private static class ListNode {
        private int data;
        private ListNode next;
        private ListNode(int data){
            this.data=data;
            this.next=null;
        }

    
        
    } 
    public void lino1(){//creating  first sorted linked List
        ListNode fir=new ListNode(1);
        ListNode sec=new ListNode(3);
        ListNode thi=new ListNode(5);
        ListNode fou=new ListNode(7);
        ListNode fiv=new ListNode(9);
        ListNode six=new ListNode(11);
        ListNode sev=new ListNode(13);
        ListNode eig=new ListNode(15);

        head=fir;
        fir.next=sec;
        sec.next=thi;
        thi.next=fou;
        fou.next=fiv;
        fiv.next=six;
        six.next=sev;
        sev.next=eig;
    }
    public void lino2(){// creating second sorted linked List 
        ListNode fir=new ListNode(0);
        ListNode sec=new ListNode(2);
        ListNode thi=new ListNode(4);
        ListNode fou=new ListNode(6);
        ListNode fiv=new ListNode(8);
        ListNode six=new ListNode(10);
        ListNode sev=new ListNode(12);
        ListNode eig=new ListNode(14);
        ListNode nin=new ListNode(16);
        ListNode ten=new ListNode(18);
        ListNode ele=new ListNode(20);
        ListNode twe=new ListNode(22);
        ListNode thir=new ListNode(24);

        head=fir;
        fir.next=sec;
        sec.next=thi;
        thi.next=fou;
        fou.next=fiv;
        fiv.next=six;
        six.next=sev;
        sev.next=eig;
        eig.next=nin;
        nin.next=ten;
        ten.next=ele;
        ele.next=twe;
        twe.next=thir;
        
    } 
    public void display(){
        ListNode curr=head;
        while (curr!=null) {
            System.out.print(curr.data+" -->");
            curr=curr.next;
        }
        System.out.println("null");
    } 


    
    public static ListNode merge(ListNode a,ListNode b){
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while (a!=null && b!=null) {
            if(a.data<=b.data){
                tail.next=a;
                a=a.next;
            }else{
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }

        if (a==null) {
            tail.next=b;
        }else{
            tail.next=a;
        }
        return dummy.next;


    }










    public static void main(String[] args) {
        mertwosor_sll s=new mertwosor_sll();
        s.lino1();
        s.display();
        s.lino2();
        s.display();

        mertwosor_sll result=new mertwosor_sll();
        result.head=merge(lino1.head, lino2.head);
        result.display();
        
    }
    
}
