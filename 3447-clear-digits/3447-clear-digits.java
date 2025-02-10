class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c) && !stack.isEmpty()){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        String v="";
        for(Character c : stack){
            v+=Character.toString(c);
        }
        return v;
    }
}