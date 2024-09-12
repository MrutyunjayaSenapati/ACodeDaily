public class secSmallLarge {
    public static void main(String[] args) {
        int arr[]={2,43,4,5,3,9};
        int n=arr.length;
        // sort array
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        System.out.println("Second smallest"+arr[1]+"Second Largest"+arr[n-1-1]);
        for(int i=0;i<=n;i++){
            System.out.println(arr[i]);
        }

    }
}
