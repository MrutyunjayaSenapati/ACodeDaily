public class largeNumArray {
    
    public static void main(String[] args) {
        int arr[]={3,43,21,43,22};
        int temp=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>temp)
            {
                temp=arr[i];
            }
        }
        System.out.println(temp);
    }
}
