
public class SearchEle {
    void ArrElement(int arr[],int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.println(arr[i]+"="+i);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,2,9,5};
       int  k=3;
       new SearchEle(). ArrElement(arr,k);
    }
    
}
