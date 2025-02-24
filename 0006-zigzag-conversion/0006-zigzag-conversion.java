class Solution {
    public String convert(String s, int numRows) {
        int n=s.length();
        StringBuffer sb = new StringBuffer();
        char ch[]=s.toCharArray();
        char arr[][]=new char[numRows][n];
        int row=0;
        int col=0;
        int current = 0; 
        while(current<n){
            while(row<numRows && current<n){
                arr[row++][col]=ch[current++];
            }
            row = Math.max(row-2,0);
            while(row>0 && current<n){
                arr[row--][++col]=ch[current++];
            }col++;
        }
        for(int i=0;i<numRows;i++){
            for(int j=0;j<n;j++){
                if((arr[i][j]>='A' && arr[i][j] <='Z') || (arr[i][j]>='a' && arr[i][j] <='z') || arr[i][j]==',' || arr[i][j]=='.'){
                System.out.print(arr[i][j]+" ");
                sb.append(arr[i][j]);}
            }System.out.println();
        }
        return sb.toString();
    }
}