class smallNumArray{
    public static void main(String[] args) {
        // find the smallest num in an array
        int [] arr={2,3,42,2,4};
        int temp=arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]<temp){
            temp=arr[i];
        }
        }
        System.out.println(temp);
    }
}
