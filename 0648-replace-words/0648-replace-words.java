class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String str[] = sentence.split(" ");
        for(int i=0;i<str.length;i++){
            for(String res : dictionary){
                if(str[i].startsWith(res)){
                    str[i] = res;
                }
            }
        }
        String result = "";
        for(int i=0;i<str.length;i++){
            if(i==0){
                result+=str[i];
            }
            else{
                result=result+" "+str[i];
            }
        }
        return result;
    }
}