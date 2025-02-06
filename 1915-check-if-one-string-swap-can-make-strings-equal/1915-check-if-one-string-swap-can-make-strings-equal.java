class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s2.length();i++){
            for(int j=i+1;j<s2.length();j++){
                char ch[] = s2.toCharArray();
                char c = ch[i];
                ch[i] = ch[j];
                ch[j]=c;
                String str = new String(ch);
                System.out.print(str+" ");
                if(s1.equals(str)){
                    return true;
                }
            }
        }
        return false;
    }
}