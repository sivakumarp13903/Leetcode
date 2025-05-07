class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b))return -1;
        int c =0;
        Map<Integer,Integer> map = new HashMap<>();
        int n = Math.max(a.length(),b.length());
        for(int i=0;i<n;i++){
            c++;
        }
        return c;
    }
}