class Solution {
    public int countOccurrences(int[] arr, int x) {
        int l=arr.length;
        int h=arr.length;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int num=arr[mid];
            if(num>=x){
                l=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int num=arr[mid];
            if(num>x){
                h=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return h-l;
    }
}