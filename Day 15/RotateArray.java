import java.util.Arrays;

public class RotateArray {
  public static int[] rotate(int[] arr,int k ){
    int n=arr.length;
    reverse(arr,0,n-1);
    reverse(arr,0,k-1);
    reverse(arr,k,n-1);
    return arr;

  }
  public static void reverse(int[] arr,int start,int end){
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
  }

    public static void main(String[] args) {
        int arr[]={10,11,12,13,14,15};
        System.out.println("Before rotation: "+Arrays.toString(arr));
        int k=2;
        System.out.println("After rotation: "+Arrays.toString(rotate(arr,k)));

    }

    
}
