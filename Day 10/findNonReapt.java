

public class findNonReapt {
// Find all the non-repeating elements in an array
void findRepeating(int arr[],int n){
    int temp[]=new int[arr.length];
    int count =0;

    for(int i=0;i<n;i++){
        boolean isRepeating=false;
        for(int j=0;j<n;j++){
            if(i!=j && arr[i]==arr[j]){
            isRepeating =true;
            break;
            }
        }
        if(!isRepeating){
            System.out.println(arr[i]);
        }
    }
  
}
public static void main(String[] args) {
    int arr[]={1,2,-3,1,4,2,1};
    int n=arr.length;
   new findNonReapt().findRepeating(arr,n);

}
    
}
