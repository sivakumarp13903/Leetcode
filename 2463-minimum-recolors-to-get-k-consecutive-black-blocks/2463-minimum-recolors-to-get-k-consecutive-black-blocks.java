class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        List<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<k;i++){ 
            sb.append(blocks.charAt(i));
        }
        list.add(sb.toString());
        char arr[] = blocks.toCharArray();
        for(int i=k;i<arr.length;i++){
            sb.deleteCharAt(0);
            sb.append(arr[i]);
            list.add(sb.toString());
        }
        System.out.println(list);
        for(String s : list){
            for(char c : s.toCharArray()){
                if(c=='W'){
                    count++;
                }
            }
            min = Math.min(min,count);
            count=0;
        }
        return min;
    }
}