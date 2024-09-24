
public class sortElmentFreq {

   void sortElment(int arr[],int n){
     int newArr[][]=new int[2][100];
    int temp;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                
            }
        }
    }

   int k=0;
   int count=0;
   for(int l=0;l<n;l++){
    if(l==0){
        newArr[0][k]=arr[l];
        count=1;
    }
    else if(arr[i]==arr[i-1]){
        count++;
    }else{
        newArr[1][k]=count;
        count=1;
        k++;
        newArr[0][k]=arr[i];
    }
   }
   newArr[1][k]=count;
   k++;
   sort
  

   }

    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,3,1,2};
        int n=arr.length;
        new sortElmentFreq().sortElment(arr,n);

    }
}
