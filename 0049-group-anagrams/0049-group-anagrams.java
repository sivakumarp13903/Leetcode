class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String key1 = new String(ch);
            if(map.containsKey(key1)){
                map.get(key1).add(str);
            }
            else{
                List<String> ls = new ArrayList<>();
                ls.add(str);
                map.put(key1,ls);
            }
        } 
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            String key = entry.getKey();
            List<String> ls = entry.getValue();
            list.add(ls);
        }
        System.out.println(list);
        return list;
    }
}