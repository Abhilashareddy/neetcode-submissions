class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap();
        for(int i:nums){
          map.put(i,map.getOrDefault(i,0)+1);
        }
         List<int[]> res=new ArrayList();
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            res.add(new int[]{e.getValue(),e.getKey()});
        }
            res.sort((a,b)->b[0]-a[0]);
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=res.get(i)[1];
        }
           
    return ans;}
    }
