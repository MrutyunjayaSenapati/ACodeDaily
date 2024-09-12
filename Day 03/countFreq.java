

public class countFreq {
    public static void main(String[] args) {
        int arr[]={10, 20, 20, 10, 10, 20, 5, 20};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            System.out.println(arr[i] +"is"+count);
        }
    }
}
