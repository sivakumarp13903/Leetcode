class Solution {

    public int numberOfSubstrings(String s) {
        char ch[] =s.toCharArray();
        int abc[] = new int[3];
        Arrays.fill(abc,-1);
        int count=0,right=0;
        while(right<ch.length){
            abc[ch[right]-'a']=right;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<abc.length;i++){
                min = Math.min(abc[i],min);
            }
            count+=(min+1);
            right++;
        }
        return count;
    }
}