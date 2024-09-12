

public class avgArr {
    public static void main(String[] args) {
        int arr[]={3,2,4,1,6};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        int avg=sum/n;
        System.out.println(avg);
    }
}
