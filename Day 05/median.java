import java.util.Arrays;
class median{
    void medianx(int arr[],int n){
        Arrays.sort(arr);
        if(n%2==0){
            int ind1=(n/2)-1;
            int ind2=n/2;
            double median=(arr[ind1]+arr[ind2])/2;
            System.out.println(median);
        }
        else{
            System.out.println(arr[n/2]);
        }
    }
    public static void main(String[] args) {
        int arr[]={33,4,2,55,2};
        int n=arr.length;
        new median().medianx(arr,n);
    }
}