class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list  = new ArrayList<>();
        Map<Character,int[]> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, new int[]{i, i}); 
            } else {
                map.get(ch)[1] = i; 
            }
        }
        int arr[][] = new int[map.size()][2];
        int c=0;
        for (Map.Entry<Character, int[]> entry : map.entrySet()) {
            char ch = entry.getKey();
            int[] indices = entry.getValue();
            arr[c][0] =  indices[0];
            arr[c][1] = indices[1];
            c++;

        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int start = arr[0][0],end = arr[0][1];
        for(int i=1;i<arr.length;i++){
            if (arr[i][0] > end) {
                list.add(end - start + 1);
                start = arr[i][0];
                end = arr[i][1];
            } else {
                end = Math.max(end, arr[i][1]);
            }
        }
        list.add(end-start+1);
        return list;
    }
}