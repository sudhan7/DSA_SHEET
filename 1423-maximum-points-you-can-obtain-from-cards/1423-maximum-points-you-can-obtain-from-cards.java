class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int arr[] = new int[n];
        int sum =0;
        
        for(int i=0; i<n; i++){
            sum+=cardPoints[i];
            arr[i] = sum;
        }
        if(k==n) return sum;
        
        int ans = 0;
        int score = 0;
        
        for(int i=0; i<=k; i++){
            int j = i + cardPoints.length - k -1;
            if(i==0)  ans = arr[j];
            else ans = arr[j] - arr[i-1];
            score = Math.max(score,sum-ans);
        }
        return score;
        
    }
}