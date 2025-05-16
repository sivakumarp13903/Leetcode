class Solution {
    public List<String> printVertically(String s) {
        String str[] = s.split(" ");
        List<String> list = new ArrayList<>();
        int max = 0;
        for(int i=0;i<str.length;i++){
            max = Math.max(str[i].length(),max);
        }
        int j=0;
        for(int i=0;i<max;i++){
            j=0;
            StringBuffer sb = new StringBuffer();
            while(j<str.length){
                if(i>=str[j].length()){
                    sb.append(" ");
                }
                else{
                    sb.append(str[j].charAt(i));
                }
                j++;
            }
            for(int k=sb.length()-1;k>0;k--){
                if(sb.charAt(k)!=' '){
                    break;
                }
                sb.deleteCharAt(k);
            }
            list.add(sb.toString());
        }
        System.out.println(list);
        return list;
    }
}