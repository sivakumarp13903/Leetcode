class Solution {

     public void backTrack(int n,int index,char ch[],List<String> list,StringBuffer sb){
        if(sb.length()==n){
            list.add(sb.toString());
            return;
        }
        else{
            for(int i=0;i<ch.length;i++){
                sb.append(ch[i]); 
                backTrack(n,i, ch, list, sb); 
                sb.deleteCharAt(sb.length() - 1); 

            }
        }
     }

    public String getHappyString(int n, int k) {
        List<String> list =  new ArrayList<>();
        char ch[]= new char[3];
        int r=0;
        for(int i=0;i<3;i++){
            ch[i]=(char)('a'-r);
            r--;
        }
        int res=0;
        backTrack(n,0,ch,list,new StringBuffer());
        for(String s : list){
            char arr[]=s.toCharArray();
            boolean flag=true;
            for(int i=1;i<arr.length;i++){
                if(arr[i-1]==arr[i]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                res++;
                if(res==k){
                    return s;
                }
            }
        }
        System.out.print(list);
        return "";
    }
}