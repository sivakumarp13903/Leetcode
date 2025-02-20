class Solution {

    public void dfs(int row,int col,char[][] grid){
        if(row<0 || col <0 || row>=grid.length || col>=grid[0].length || grid[row][col] == '0'){
            return;
        }

        grid[row][col]='0';
        
        dfs(row-1,col,grid);
        dfs(row+1,col,grid);
        dfs(row,col+1,grid); 
        dfs(row,col-1,grid);
    }

    public int numIslands(char[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    res++;
                    dfs(i,j,grid);
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j]+ " ");
            }System.out.println();
        }
        return res;
    }
}