class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0, 1);
        
        for(int num: nums){
            sum += num;
            int key = (sum % k + k) % k;
            count += map.getOrDefault(key,0);
            map.put(key, map.getOrDefault(key,0)+1);
        }
        return count;
    }
}



       