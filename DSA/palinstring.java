import java.util.Scanner;

class palinstring {
    public void pstring(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String st=sc.nextLine();
        char[] charray=st.toCharArray();
        int s=0;

        int e=charray.length-1;
        while(s<e){
            if(charray[s]!=charray[e]){
                System.out.println("not a palindrome String");
                break;
            }
            else{
                s++;
                e--;

            }
            


        }
        if (s==e || s>e) {
            System.out.println("Palindrome string");
            
        }

    }

    public static void main(String args[]){
        palinstring ps=new palinstring();
        ps.pstring();
    }




    
}

