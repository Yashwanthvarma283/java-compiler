class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int x:nums){
            List<Integer> inner=new ArrayList<>();
            while(x>0){
                int rem=x%10;
                inner.add(rem);
                x=x/10;
            }
            for(int i=inner.size()-1;i>=0;i--){
                list.add(inner.get(i));
            }
        }
        int result[]=new int[list.size()];
        int i=0;
        for(int x:list){
            result[i++]=x;
        }
        return result;
    }
}