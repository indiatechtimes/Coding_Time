class removeEven {
    public void remEven(){
            
            int[] myarray=new int[10];
            myarray[0]=1;
            myarray[1]=2;
            myarray[2]=3;
            myarray[3]=4;
            myarray[4]=5;
            myarray[5]=6;
            myarray[6]=7;
            myarray[7]=8;
            myarray[8]=9;
            myarray[9]=10;

            int x= myarray.length;
            System.out.println("length of array " +x);
            System.out.println("below the items of array");
            
            for(int i=0;i<x;i++){
                int a= myarray[i];
                System.out.print(" "+a);

            }
            System.out.println(" ");
            System.out.println("below the items of array after removing even Integers");
            for(int j=0;j<x;j++){
                int b=myarray[j];
                if (b%2==0) {
                    System.out.print(" ");
                    
                }
                else{
                    System.out.print(b);
                }
            }
        
    }

    public static void main (String args[]){
        removeEven fin=new removeEven();
        fin.remEven(); 
    }
    
}
