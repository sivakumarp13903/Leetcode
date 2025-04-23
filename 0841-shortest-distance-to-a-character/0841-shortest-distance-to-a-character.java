class Solution {

    public int findDistance(List<Integer> list,int i1){
        if(list.size()>=2){
            for(int i=1;i<list.size();i++){
                if(i1>list.get(i-1) && i1<list.get(i)){
                    return Math.min(Math.abs(i1-list.get(i)),Math.abs(i1-list.get(i-1)));
                }
            }
        }
        return -1;
    }

    public int[] shortestToChar(String s, char c) {
        int arr[] = new int[s.length()];
        List<Integer> list = new ArrayList<>();
        char ch[] = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] == c){
                list.add(i);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(!list.contains(i)){
                if(i<list.get(0)){
                    arr[i] = Math.abs(i-list.get(0));
                }
                else if(i>list.get(list.size()-1)){
                    arr[i] = Math.abs(i-list.get(list.size()-1));
                }
                else{
                    arr[i] = findDistance(list,i);
                }
            }
        }
        System.out.println(list);
        return arr;
    }
}