class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuffer sb = new StringBuffer();
        for(char c : s.toCharArray()){
            if(c!='-')sb.append(Character.toUpperCase(c));
        }
        char ch[] = sb.toString().toCharArray();
        int t = 0;
        sb.setLength(0);
        for(int i=ch.length-1;i>=0;i--){
            if(t==k){sb.insert(0,'-');t=0;}
            sb.insert(0,ch[i]);
            t++;
        }
        return sb.toString();
    }
}