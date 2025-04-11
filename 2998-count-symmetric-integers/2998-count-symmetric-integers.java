class Solution {

    public boolean checkSymetric(String s){
        int n1 = Integer.parseInt(s.substring(0,(s.length()/2)));
        int n2 = Integer.parseInt(s.substring(s.length()/2,(s.length())));
        System.out.println(n1+" "+n2);
        int sum1=0,sum2=0;
        while(n1>0){
            sum1+=(n1%10);
            n1/=10;
        }
        while(n2>0){
            sum2+=(n2%10);
            n2/=10;
        }
        return sum1==sum2;
    }

    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        List<Integer> list = new ArrayList<>();
        for(int i=low;i<=high;i++){
            String s = Integer.toString(i);
            if(s.length()%2==0){
                if(checkSymetric(s)){
                    c++;
                }
            }
        }
        return c;
    }
}