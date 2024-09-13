

public class removeDuplicate {
   public static int removeElement(int arr[], int n){
        int count=0;
        for(int i=0;i<n;i++){
           if(i<n-1 &&arr[i]==arr[i+1]){
            continue;
           }
           else{
            arr[count]=arr[i];
            count++;
           }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,5,7,7};
        int n=arr.length;
     int result=  removeElement(arr,n);
       for(int i=0;i<result;i++){
        System.out.println(arr[i]);
       }
     
    }
    
}
