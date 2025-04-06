class Solution {

    public static boolean containsWord(Map<Character,Integer> map, Map<Character,Integer> map2){
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            Character key = entry.getKey();
            Integer val = entry.getValue();
            if (!map2.containsKey(key) || map2.get(key) < val) {
                return false;
            }
        }return true;
    }

   
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String s = licensePlate.toLowerCase();
        StringBuffer sb = new StringBuffer();
        for(char c : s.toCharArray()){
            if(c>='a' && c<='z'){
                sb.append(c);
            }
        }
        String v=null;
        char ch[] = sb.toString().toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char c : ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
        for (String word : words) {
            Map<Character, Integer> map2 = new HashMap<>();
            for (char c : word.toLowerCase().toCharArray()) {
                map2.put(c, map2.getOrDefault(c, 0) + 1);
            }

            if (containsWord(map, map2)) {
                if (v == null || word.length() < v.length()) {
                    v = word;
                }
            }
        }
        return v;

    }
}