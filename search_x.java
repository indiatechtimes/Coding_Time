public class search_x {  // search an element in SinglyLinked List
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
        while(current !=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }



    /*public void sele(int x){ // My Logic
        ListNode current=head;
        int p=1;
        while(current!=null){
            if(current.data==x){
                System.out.println(x+" is found at "+" position "+p);

            }
            p++;
            current=current.next;
        }

        System.out.println("                      end");
        
    }*/

    



    public static void main(String args[]){
        search_x s=new search_x();
        s.insertfirst(1);
        s.insertfirst(2);
        s.insertfirst(3);
        s.insertfirst(4);
        s.insertfirst(5);
        s.insertfirst(6);
        s.insertfirst(7);
        s.insertfirst(8);
        s.insertfirst(7);

        s.display();

        s.sele(7);
    }

}
