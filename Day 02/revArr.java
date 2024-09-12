

public class revArr {
    public static void main(String[] args) {
        // Reverse a given Array
        int arr[]={5,4,3,2,1};
        int n=arr.length;
        int temp=0;
        
            for(int j=0;j<n/2;j++){
                temp=arr[j];
                arr[j]=arr[n-j-1];
                arr[n-j-1]=temp;

            }
    
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
