class Solution {
    public boolean isPalindrome(String s) {
        String res = "";
        int n = s.length();
        for(int i=0; i<n;i++){
            char a = s.charAt(i);
            if(Character.isAlphabetic(a) || Character.isDigit(a)){
                res+=Character.toLowerCase(a);
            }
        }
        
        int left = 0;
        int right = res.length()-1;
        
        while(left < right){
            if(res.charAt(left) == res.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}