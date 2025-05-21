class Solution {
    public String addStrings(String num1, String num2) {
        long n1= 0;
        long n2 = 0;
        StringBuffer sb = new StringBuffer();
        char ch1[] = num1.toCharArray();
        char ch2[] = num2.toCharArray();
        int x=ch1.length-1,y=ch2.length-1;
        int prev = 0;
        while(x>=0 && y>=0){
            int n = (ch1[x]-'0') + (ch2[y]-'0');
            if(prev!=0){
                n+=prev;
                prev = 0;
            }
            if(n>9){
                sb.insert(0,String.valueOf(n%10));
                prev = n/=10;
            }
            else{
                sb.insert(0,String.valueOf(n));
            }
            // System.out.println(sb);
            x--;y--;
        }
        while(x>=0){
            int n = (ch1[x--]-'0');
            if(prev!=0){
                n+=prev;
                // System.out.println("Updated"+n);
                prev=0;
            }
            if(n>9){
                sb.insert(0,String.valueOf(n%10));
                prev = n/=10;
            }
            else{
                if(prev!=0){
                    sb.insert(0,String.valueOf(n+prev));
                    prev = 0;
                }
                else{
                    sb.insert(0,String.valueOf(n));
                }                
            }            
        }
        while(y>=0){
            int n = (ch2[y--]-'0');
            if(prev!=0){
                n+=prev;
                // System.out.println("Updated"+n);
                prev=0;
            }
            if(n>9){
                sb.insert(0,String.valueOf(n%10));
                prev = n/=10;
            }
            else{
                if(prev!=0){
                    sb.insert(0,String.valueOf(n+prev));
                    prev = 0;
                }
                else{
                    sb.insert(0,String.valueOf(n));
                }                
            }
        }
        if(prev!=0){
            sb.insert(0,String.valueOf(prev));
        }
        return sb.toString();
    }
}