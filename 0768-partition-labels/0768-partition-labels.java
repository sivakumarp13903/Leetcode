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
            // System.out.println(ch + " => Start: " + indices[0] + ", End: " + indices[1]);
            arr[c][0] =  indices[0];
            arr[c][1] = indices[1];
            c++;

        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int start = arr[0][0],end = arr[0][1];
        for(int i=1;i<arr.length;i++){
            // System.out.println(arr[i][0] +" "+ arr[i][1]+" " +start+" "+end);
            // System.out.println(end+" "+arr[i][0]);
            if(end<arr[i][0]){
                // System.out.println("hii");
                list.add(end-start+1);
                start = arr[i][0];
                end = arr[i][1];
            }
            else if(start > arr[i][0] && end < arr[i][1]){
                start = arr[i][0];
                end = arr[i][1];
            }
            else if(start < arr[i][0] && end < arr[i][1]){
                end = arr[i][1];
            }
            else if(start > arr[i][0] && end > arr[i][1]){
                start = arr[i][0];
            }
        }
        list.add(end-start+1);
        return list;
    }
}