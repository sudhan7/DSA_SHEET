class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n <= 1){
            return;
        }
        int left = 0;
        int right = 0;
        
        while(right < n){
            if(nums[right] == 0){
                right++;
            }else{
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
                right++;
                
            }
        }
         
    }
}