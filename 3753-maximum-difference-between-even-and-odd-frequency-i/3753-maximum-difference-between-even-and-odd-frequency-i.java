class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int even=Integer.MAX_VALUE;
        int odd=Integer.MIN_VALUE;
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()%2==0){
                even=Math.min(even,entry.getValue());
            }
            else if(entry.getValue()%2!=0) {
                odd = Math.max(odd,entry.getValue());
            }
        }
        int max = even>odd?even:odd;
        int min = even<odd?even:odd;
        return odd-even;
    }
}