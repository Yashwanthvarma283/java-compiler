import java.util.*;

class Solution {
    public int[] maxValue(int[] nums) {
        int n=nums.length;
        int maxPrefix[]=new int[n];
        int minSuffix[]=new int[n];
        maxPrefix[0]=nums[0];
        minSuffix[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            maxPrefix[i]=Math.max(maxPrefix[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
            minSuffix[i]=Math.min(minSuffix[i+1],nums[i]);
        }
        int ans[]=new int[n];
        ans[n-1]=maxPrefix[n-1];
        for(int i=n-2;i>=0;i--){
            if(maxPrefix[i]>minSuffix[i+1]){
                ans[i]=ans[i+1];
            }
            else ans[i]=maxPrefix[i];
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        nums=obj.maxValue(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
