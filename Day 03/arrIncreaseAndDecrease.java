

public class arrIncreaseAndDecrease {
    public static void main(String[] args) {
        int arr[]={ 8,7,1, 6, 5, 9};
    int n=arr.length;
        int temp=0;
    for(int i=0;i<n;i++){
       for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
        }

    }
    for (int i = 0; i < n / 2; i++) {
        System.out.print(arr[i] + " ");
      }
      for (int i = n - 1; i >= n / 2; i--) {
        System.out.print(arr[i] + " ");
      }
  
    }
    
}
