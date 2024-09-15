import java.util.Arrays;

public class addElement {
   public static int[] insertatpos(int arr[],int x,int pos,int n){
    int newArr[]=new int[n+1];
    for(int i=0;i<n+1;i++){
        if(i<pos-1){
            newArr[i]=arr[i];

        }
        else if(i== pos-1){
            newArr[i]=x;
        }
        else{
            newArr[i]=arr[i-1];
        }
    }
    // for(int i=0;i<=n;i++){
    //     System.out.println("insertPos"+newArr[i]);
    // }

return newArr;
   }
    public static int[] insertending(int arr[],int x,int n){
        //insertatpos( arr,8,4,n);

        int newArr[]=new int[n+1];
        for(int i=0;i<n;i++){
            newArr[i]=arr[i];

        }
        newArr[n]=x;
        // for(int i=0;i<=n;i++){
        //     System.out.println("insertEnding"+newArr[i]);
        // }
return newArr;
    }

    public static int[] insertBegining(int arr[],int x,int n){
        //insertending(arr,7,n);
        int newArr[]=new int[n+1];
        for(int i=0;i<n;i++){
            newArr[i+1]=arr[i];
            
        }
         newArr[0]=x;
        // for(int i=0;i<=n;i++){
        //     System.out.println(newArr[i]);
        // }
        return newArr;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;

        arr = insertBegining(arr, 6, n);
        n = arr.length;  // Update size after insertion
        System.out.println("After inserting at the beginning: " + Arrays.toString(arr));

        arr = insertending(arr, 7, n);
        n = arr.length;  // Update size after insertion
        System.out.println("After inserting at the end: " + Arrays.toString(arr));

        arr = insertatpos(arr,8, 4, n);
        n = arr.length;  // Update size after insertion
        System.out.println("After insertpos at the end: " + Arrays.toString(arr));


       


    }
}
