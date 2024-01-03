class removeEven {
    public void remEven(){
            
            int[] myarray={10,9,8,7,6,5,4,3};
            int x= myarray.length;
            System.out.println("length of array"+x);
            System.out.println("below the items of array");
            
            for(int i=0;i<=x;i++){
                int a= myarray[i];
                System.out.print(" "+a);

            }
            System.out.println("below the items of array after removing even ");
            for(int j=0;j<=x;j++){
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
