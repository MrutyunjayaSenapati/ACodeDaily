class findRepeating{
    void  findRep(int arr[], int n){
       int temp[]=new int[arr.length];
       int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            if(arr[i]==arr[j])
            {
               temp[count++]=arr[i];
            }
        }
        for(int l=0;l<=count;l++){
            if(temp[l]!=temp[l+1])
        System.out.println(temp[l]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,4,5,2};
        int n=arr.length;
       new findRepeating(). findRep(arr, n);
    }
}