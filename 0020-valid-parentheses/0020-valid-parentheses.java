class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans = new Stack<>();
        char arr[] = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == '(' || arr[i] == '[' || arr[i] == '{'){
                ans.push(arr[i]);
            }
            else if(!ans.isEmpty() && ans.peek() == '(' && arr[i] == ')'){
                ans.pop();
            }
            else if(!ans.isEmpty() && ans.peek() == '[' && arr[i] == ']'){
                ans.pop();
            }
            else if(!ans.isEmpty() && ans.peek() == '{' && arr[i] == '}'){
                ans.pop();
            }
            else{
                return false;
            }
        }
        if(!ans.isEmpty()){
            return false;
        }
        return true;
    }
}