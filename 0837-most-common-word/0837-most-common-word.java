class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String,Integer> map = new HashMap<>();
        for(String s : paragraph.split(" ")){
            String str[]=s.split(",");
            if(str.length>1){
                for(String a : str){
                StringBuffer sb = new StringBuffer();
                for(char c : a.toCharArray()){
                    if((c>='a' && c<='z') || (c>='A' && c<='Z'))
                        sb.append(c);
                    }
                String v = sb.toString();
                v=v.toLowerCase();
                if(!Arrays.asList(banned).contains(v))
                    map.put(v,map.getOrDefault(v,0)+1);
            }}
            StringBuffer sb = new StringBuffer();
            for(char c : s.toCharArray()){
                if((c>='a' && c<='z') || (c>='A' && c<='Z'))
                    sb.append(c);
            }
            String v = sb.toString();
            v=v.toLowerCase();
            if(!Arrays.asList(banned).contains(v))
                map.put(v,map.getOrDefault(v,0)+1);
        }
        int t = 0;
        String res="";
        System.out.println(map);
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(t<entry.getValue()){
                t=entry.getValue();
                res=entry.getKey();
            }
        }
        return res;
    }
}