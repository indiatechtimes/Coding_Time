import java.util.*;
public class pallindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number you want to check");
        int num=sc.nextInt();
        int nom=num;
        int rev=0;
        int rem;
        while(num!=0)
        {
            rem=num%10; 
            rev=rev*10+rem;
            num=num/10;
        }
        //int num2=rev;
        //System.out.println("reverse of num is :"+rev);  
        System.out.println("reverse"+rev); 
        System.out.println(num);    
        if(nom==rev){
           System.out.println("pallindrome");
        }
        else{
            System.out.println("not pallindrome");
        }
    }

}    
        
        
       

