//Maximum Product Subarray in an Array



public class maxProduct {
    void maxProd(int arr[],int n){
        int result=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                {
                    int prod=1;
                    for(int k=i;k<=j;k++){
                        prod=prod*arr[k];
                        result=Math.max(result,prod);
                    }
                }
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int arr[]={1,2,-3,4,5};
        int n=arr.length;
       new maxProduct(). maxProd(arr,n);
    }
    
}
