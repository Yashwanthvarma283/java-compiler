class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1, high=0;
        for(int x:piles){
            if(high<x){
                high=x;
            }
        }
        while(low<=high){
            int temp=0;
            int mid=low+(high-low)/2;
            for(int x:piles){
                temp+=Math.ceil((double) x/ (double) mid);
            }
            if(temp<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}