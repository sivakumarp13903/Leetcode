class Solution {



    public boolean checkDig(String s){
        return s.charAt(0)==s.charAt(1) && s.charAt(1)==s.charAt(2);
    }
    public String findMax(List<String> list){
        String res="000";
        for(String s : list){
            int t = Integer.parseInt(s);
            if(t!=0){
                int v = Integer.parseInt(res);
                if(v<t){
                    res = s;
                }
            }
        }
        return res;
    }

    public String largestGoodInteger(String num) {
        List<String> list = new ArrayList<>();
        int max=0;
        String str = "";
        StringBuffer sb = new StringBuffer();
        sb.append(num.substring(0,3));
        System.out.print(sb);
        if(checkDig(sb.toString())){
            list.add(sb.toString());
        }
        for(int i=3;i<num.length();i++){
            sb.deleteCharAt(0);
            sb.append(num.charAt(i));
            System.out.println(sb);
            if(checkDig(sb.toString())){
               list.add(sb.toString());
            }
        }
        System.out.println(list);
        
        return list.isEmpty()?"":findMax(list);
    }
}

