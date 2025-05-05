class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length * mat[0].length)return mat;
        int arr[][] = new int[r][c];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                list.add(mat[i][j]);
            }
        }
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(k<list.size())
                    arr[i][j] = list.get(k);k++;
            }
        }
        System.out.println(list);
        return arr;
    }
}