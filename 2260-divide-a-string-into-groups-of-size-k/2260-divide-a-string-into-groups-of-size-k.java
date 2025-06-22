class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        int size;
        if(s.length()%k==0){
            size =0;            
        }
        else{
            size =1;
        }
        String arr[] = new String[size];
        for(char c : s.toCharArray()){
            // System.out.println(c+" "+sb+" "+sb.length()+" -> "+k);
            sb.append(c);
            if(sb.length()==k){
                
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        while(sb.length()<k && size==1){
            sb.append(fill);
            if(sb.length()==k){
                list.add(sb.toString());
            }
        }
        // System.out.println(arr.length);
        String[] array = list.toArray(new String[list.size()]);
        return array;
    }
}