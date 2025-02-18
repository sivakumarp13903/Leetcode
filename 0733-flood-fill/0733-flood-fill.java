class Solution {

    public void bfs(int[][] image,int sr,int sc,int Ncolor, int color){
        if(sr<0 || sc<0 || sc>=image[0].length || sr>=image.length || image[sr][sc]!=color){
            return;
        }
            image[sr][sc]=Ncolor;
            System.out.println("ch");
            bfs(image,sr-1,sc,Ncolor,color);
            bfs(image,sr+1,sc,Ncolor,color);
            bfs(image,sr,sc-1,Ncolor,color);
            bfs(image,sr,sc+1,Ncolor,color);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int Ncolor) {
        int color = image[sr][sc];
        if (color != Ncolor) {
            bfs(image, sr, sc, Ncolor, color);
        }
        return image;
    }
}