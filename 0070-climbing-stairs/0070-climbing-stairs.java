class Solution {

	
	public static int climbStairs(int n) {
        int p1 = 1;
        int p2 = 2;
        if (n == p1) return p1;
        if (n == p2) return p2;
		for(int i=3;i<=n;i++){
            int c = p1+p2;
            p1=p2;
            p2 = c;
        }	
        return p2;
	}
}