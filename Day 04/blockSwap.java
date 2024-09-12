

public class blockSwap {
     void swapArr(int arr[],int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i>=k){
                System.out.println(arr[i]);
            }
            else{
                System.out.println(arr[i]);
            }
        }
     }
    public static void main(String[] args) {
        int arr[]={32,42,432,22,53};
         new blockSwap().swapArr(arr,2);
    }
}
