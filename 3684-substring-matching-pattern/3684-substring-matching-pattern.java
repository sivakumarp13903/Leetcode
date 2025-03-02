class Solution {
    public boolean hasMatch(String s, String p) {
        int index = p.indexOf('*');
        int f = s.indexOf(p.substring(0,index));
        int e = s.indexOf(p.substring(index+1),f+index);
        if(f!=-1 && e!=-1){
            return true;
        }
        return false;
    }
}