class Solution {
    public int maxArea(int[] height) {
        int count = 0;
        int left = 0;
        int right = height.length - 1;
        
        while(left < right){
            int temp = Math.min(height[left], height[right])*(right-left);
            if(temp > count) count = temp;
            if(Math.min(height[left], height[right]) == height[left]){
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
}