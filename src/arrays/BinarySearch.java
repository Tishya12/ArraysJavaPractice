package arrays;

public class BinarySearch {

        public static int binarysearch(int arr[], int n, int k){
            int l=0;
            int r=n-1;
            while(r>=l){
                int mid=(l+r)/2;
                if(arr[mid]>k){
                    r--;
                }
                else if(arr[mid]<k){
                    l++;
                }
                else{
                    return mid;           }
            }
            return -1;
        }
    public static void main(String args[]){
            int arr[]={1,2,3,4,5};
            int ans=binarysearch(arr,5,5);
            System.out.println(ans);

    }
}
