class Solution {
    public int minimumDeletions(String s) {
        int val=0,c=0;
        for(char c1 : s.toCharArray()){
            if(c1=='b'){
                c++;
            }
            else if(c!=0){
                c--;
                val++;
            }
        }return val;
    }
}