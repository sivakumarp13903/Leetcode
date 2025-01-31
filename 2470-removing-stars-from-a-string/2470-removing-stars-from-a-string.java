class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c>='a' && c<='z'){
                stack.push(c);
            }
            else{
                if(c=='*' && !stack.isEmpty()){
                    stack.pop();
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        while(!stack.isEmpty()){
            sb.insert(0,stack.peek());
            stack.pop();
        }
        return sb.toString();
    }
}