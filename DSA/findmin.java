class findmin {
    public void min(){
        
        int[]arr=new int[5];
        arr[0]=5;
        arr[1]=2;
        arr[2]=8;
        arr[3]=1;
        arr[4]=4;
        int vmin= arr[0];
        int x=arr.length;
        for(int i=1;i<x;i++){
            if(arr[i]<vmin){
                vmin=arr[i];

            }

        }
        System.out.println("minimum value of array= "+vmin);

    }
    public static void main(String args[]){
        findmin fin=new findmin();
        fin.min();
    }
    
}
