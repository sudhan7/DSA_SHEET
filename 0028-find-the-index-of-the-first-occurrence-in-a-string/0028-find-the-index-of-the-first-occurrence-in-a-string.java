class Solution {
    public int strStr(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();
        
        if(m==1 && n==1) return 0;
        
        for(int i=0; i<n-m+1; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i,m+i).equals(needle)){
                    return i;
                 }    
            }
           
        }
        return -1;
    }
}