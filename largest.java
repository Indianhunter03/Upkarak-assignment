class Main {
    public static void main(String[]args){
        double temp=0;  // double Data TYPE IS used for integer or decimal value both case it will work
        int[] arr = {20,45,21,6,5,4,3,1,9,12,18}; // Example Array or you can write any array here
        int n= arr.length;
        for(int i=0;i<n;i++){
           if(temp<arr[i]){
               temp=arr[i];
           }
        }
        System.out.print(temp);
    }
}
