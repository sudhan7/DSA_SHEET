class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int pre = 1;
        for(int i=0; i<nums.length; i++){
            res[i] = pre;
            pre*= nums[i];
        }
        
        int pos = 1;
        for(int i=nums.length-1; i>=0; i--){
            res[i]*=pos;
            pos*=nums[i];
        }
        return res;
    }
}