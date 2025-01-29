class Solution {
    public int equalPairs(int[][] grid) {
        int c=0;
        List<List<Integer>> l1 = new ArrayList<>();
        List<List<Integer>> l2 = new ArrayList<>();
        for(int i =0 ;i<grid.length;i++){
            List<Integer> stack = new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                stack.add(grid[j][i]);
            }
            l2.add(stack);
        }
        for(int i =0 ;i<grid.length;i++){
            List<Integer> stack = new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                stack.add(grid[i][j]);
            }
            l1.add(stack);
        }
        System.out.println(l1);
        System.out.println(l2);
        for(List<Integer> list1 : l1){
             for (List<Integer> list2 : l2) {
                if(list1.equals(list2)){
                    c++;
                }
            }
        }
        return c;
    }
}