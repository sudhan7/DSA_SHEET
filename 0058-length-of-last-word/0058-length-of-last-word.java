class Solution {
    public int lengthOfLastWord(String s) {
         String s1 = s.trim();
        int LastWord;
        int last = s1.lastIndexOf(' ');
        if (last == -1) {
           LastWord = s1.length();
        } else {
         LastWord = s1.length() - last - 1;
        }
        return LastWord;
    }
}