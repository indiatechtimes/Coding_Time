import java.util.*;
/**
 * Add_x_no
 */
public class Add_x_no {
    int sum;

    public void add(){//  making function 
        

        System.out.println("enter how many number you want to add");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] myarray =new int [a];//making array 
        for(int i=0;i<a;i++){// loop for inserting the items in array
            System.out.println("Enter next number");// printing massage to reenter the no
            myarray[i]=sc.nextInt();// inserting element in array

        }

        
        for(int i=0;i<a;i++){// loop for adding all elements(no) one by one 
            int s=myarray[i];// putting one by one elements in variable s
            sum=sum+s;// going to add 
        }
        
        System.out.println("sum of no="+sum);// printing the sum

    }
    public static void main(String[] args) {// main function
        Add_x_no fiNo=new Add_x_no(); // making the object of function
        fiNo.add();// calling of that function
    }
}