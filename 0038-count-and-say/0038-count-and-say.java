class Solution {
	public static String result= "";
	public void backTrack(int c,int n,String res,List<String> list) {
		if(n==c) {
			result = res;
			return;
		}
		else {
			char ch[] = res.toCharArray();
			StringBuffer sb = new StringBuffer();
			if(ch.length==1) {
				sb.append("11");
				list.add("11");
				backTrack(c+1,n,sb.toString(),list);
			}
			else {
				for(int i=0;i<ch.length;) {
					int current = ch[i]-'0';
					int k = i+1;
					int count = 1;
					while(k<ch.length && ch[k]-'0' == current) {
						count++;
						k++;
					}
					sb.append(count);
					sb.append(current);
					i=k;
				}
				list.add(sb.toString());
				backTrack(c+1,n,sb.toString(),list);
			}
			
		}
	}
	
	public String countAndSay(int n) {
		String res = "1";
		List<String> list = new ArrayList<>();
		list.add(res);
		
		backTrack(1,n,res,list);
		return list.get(n-1);
	}
	
}
