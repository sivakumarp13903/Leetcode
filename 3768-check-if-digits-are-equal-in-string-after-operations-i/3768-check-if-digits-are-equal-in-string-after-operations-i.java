class Solution {
    public boolean hasSameDigits(String s) {
        StringBuffer sb =new StringBuffer();
        for(int i=0;i<s.length()-1;i++){
            if(s.length()==2 && s.charAt(0)==s.charAt(1)){
                return true;
            }
            int a = Integer.parseInt(String.valueOf(s.charAt(i)));
            int b =  Integer.parseInt(String.valueOf(s.charAt(i+1)));
            int c = (a+b)%10;
            String v=Integer.toString(c);
            sb.append(v);
            if(s.length()-1 == sb.length()){
                System.out.println(s);
                s=sb.toString();
                sb = new StringBuffer();
                i=-1;
            }
        }
        return false;
    }
}