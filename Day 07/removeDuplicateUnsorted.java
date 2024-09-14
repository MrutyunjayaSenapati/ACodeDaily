

public class removeDuplicateUnsorted {
    // Remove duplicate from an unsorted array
    public static int [] sortArray(int arr[],int n){ int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public void  removeDuplicate(int arr[],int n){
        sortArray(arr, n);
        int count=0;
       for(int i=0;i<n;i++){
        if(i<n-1 && arr[i]==arr[i+1]){
            continue;
        }
        else{
            arr[count]=arr[i];
            count++;
        }
       }
       for(int i=0;i<count;i++){
        System.out.println(arr[i]);
    }
    }
    public static void main(String[] args) {
        int arr[]={2,3,2,5,1,6};
        int n=arr.length;
       new removeDuplicateUnsorted(). removeDuplicate(arr,n);

    }
    
}
