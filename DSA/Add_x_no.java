import java.util.*;
/**
 * Add_x_no
 */
public class Add_x_no {
    int sum;

    public void add(){
        

        System.out.println("enter how many number you want to add");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] myarray =new int [a];
        for(int i=0;i<a;i++){
            System.out.println("Enter number");
            myarray[i]=sc.nextInt();

        }

        
        for(int i=0;i<a;i++){
            int s=myarray[i];
            sum=sum+s;
        }
        
        System.out.println("sum of no="+sum);

    }
    public static void main(String[] args) {
        Add_x_no fiNo=new Add_x_no();
        fiNo.add();
    }
}