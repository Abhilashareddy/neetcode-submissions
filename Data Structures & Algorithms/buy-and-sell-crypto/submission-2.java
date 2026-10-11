class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1,n=prices.length;
        int max=0;
        while(r<n){
            if(prices[l]<prices[r]){
                max=Math.max(max,prices[r]-prices[l]);
            }else{
                l=r;
            }
            r++;
        }
    return max;}

}
