class Solution {
    public boolean canConstruct(String r, String m) {
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(char c : r.toCharArray()){
            int t = c-'a';
            arr1[t]++;
        }
        for(char c : m.toCharArray()){
            int t = c-'a';
            arr2[t]++;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] > arr2[i] ){
                return false;
            }
        }
        return true;
    }
}