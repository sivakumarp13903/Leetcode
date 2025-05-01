class Solution {

    public void backTrack(int open,int close,StringBuffer sb,List<String> list,int n){
        if(n==open && n==close && !list.contains(sb.toString())){
            list.add(sb.toString());
            return;
        }
        if(open < n){
            sb.append('(');
            backTrack(open+1,close,sb,list,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open && close<n){
            sb.append(')');
            backTrack(open,close+1,sb,list,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backTrack(0,0,new StringBuffer(),list,n);
        return list;
    }
}