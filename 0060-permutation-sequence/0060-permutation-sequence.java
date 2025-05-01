class Solution {

    private void backTrack(int index,List<String> list,char ch[],boolean flag[],StringBuffer sb){
        if(sb.length() == ch.length){
            list.add(sb.toString());
            return;
        }
        for(int i=index;i<ch.length;i++){
            if(flag[i]){
                continue;
            }
            flag[i] = true;
            sb.append(ch[i]);
            backTrack(0,list,ch,flag,sb);
            sb.deleteCharAt(sb.length()-1);
            flag[i] = false;
        }
    }

    public String getPermutation(int n, int k) {
        String s="";
        for(int i=1;i<=n;i++){
            s+=Integer.toString(i);
        }
        List<String> list=new ArrayList<>();
        boolean flag[] = new boolean[s.length()];
        backTrack(0,list,s.toCharArray(),flag,new StringBuffer());
        // System.out.println(list);
        for(int i=0;i<list.size();i++){
            if(i+1==k){
                return list.get(i);
            }
        }
        return s;
    }
}