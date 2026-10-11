class Solution {
    public int maxProfit(int[] prices) {
        int max=0,n=prices.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(prices[i]<prices[j]){
                max=Math.max(max,prices[j]-prices[i]);}
            }
        }
    return max;}
}
