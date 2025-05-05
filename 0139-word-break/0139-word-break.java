class Solution {

    public boolean isWord(String s,List<String> word,Map<String,Boolean> memo){
        if(s.equals("")){
            return true;
        }
        if(memo.containsKey(s)){
            return memo.get(s);
        }
        for(int i=0;i<s.length();i++){
            if(word.contains(s.substring(0,i+1)) && isWord(s.substring(i+1),word,memo)){
                memo.put(s,true);
                return true;
            }
        }
        memo.put(s,false);
        return false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        return isWord(s,wordDict, new HashMap<>());
    }
}