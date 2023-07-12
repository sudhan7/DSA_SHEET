class Solution {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start < end ){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            else{
                return ispalindrome(s,start+1,end) || ispalindrome(s,start,end-1);
            }
        }
        return true;
    }
    
    public boolean ispalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}