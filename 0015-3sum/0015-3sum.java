class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
            if(i == 0 || i>0 && nums[i] != nums[i-1]){
                int low = i+1;
                int hi = nums.length-1;
                int sum = 0 - nums[i];
                
                while(low<hi){
                    if(nums[low] + nums[hi] == sum){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[low]);
                        temp.add(nums[hi]);
                        ans.add(temp);
                    
                        while(low<hi && nums[low] == nums[low+1]) low++;
                        while(low < hi && nums[hi] == nums[hi-1]) hi--;

                        low++;
                        hi--;
                    }
                    else if(nums[low] + nums[hi] < sum){
                        low++;
                    }
                    else{
                        hi--;
                    }
                }
                
            }
        }
        return ans;
    }
}