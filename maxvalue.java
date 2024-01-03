class maxvalue {
    public void max(){
        int[] arr= new int[5];
        arr[0]=5;
        arr[1]=1;
        arr[2]=0;
        arr[3]=20;
        arr[4]=10;
        int maxi=arr[0];
        int len=arr.length;
        for(int i=1;i<len;i++){
            if (arr[i]>maxi) {
                maxi=arr[i];

                
            }
        }
        System.out.println("maximum number is = "+maxi);
        
        
    }
    public static void main(String args[]){
        maxvalue mv=new maxvalue();
        mv.max();
    }
}
