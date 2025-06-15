class StockSpanner {
    
    public List<Integer> list = new ArrayList<>();
    public StockSpanner() {
        
    }

    public int checkCount(int price,List<Integer> list){
        int count = 0;
        list.add(price);
        int i=list.size()-1;
        while(i>=0){
            if(list.get(i)<=price){
                count++;
            }
            else{
                return count;
            }
            i--;
        }
        return count;
    }
    
    public int next(int price) {
        return checkCount(price,list);
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */