class Solution {
    public void backTrack(int open,int close,int n,List<String> list,StringBuffer stack){
        if(open == n && close == n){
            // StringBuffer sb = new StringBuffer();
            // for(char c : stack){
            //     System.out.print(c);
            //     sb.append(c);
            // }System.out.println();
            list.add(stack.toString());
        }
        else{
            if(open<n){
                stack.append('(');
                backTrack(open+1,close,n,list,stack);
                stack.deleteCharAt(stack.length()-1);
            }
            if(open>close){
                stack.append(')');
                backTrack(open,close+1,n,list,stack);
                stack.deleteCharAt(stack.length()-1);
            }
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuffer stack = new StringBuffer();
        backTrack(0,0,n,list,stack);
        return list;
    }
}