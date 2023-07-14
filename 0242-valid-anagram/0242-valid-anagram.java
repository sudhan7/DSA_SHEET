class Solution {
    public boolean isAnagram(String s, String t) {
        
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int i=0,j=0;
        
        if(a.length != b.length){
            return false;
        }else{
            while(i<a.length){
                if(a[i] != b[j]){
                    return false;
                }
                i++;
                j++;
            }
        }
        return true;
        
        
    }
}