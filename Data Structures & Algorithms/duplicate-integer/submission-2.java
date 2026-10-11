class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> storage=new HashMap();

        for(int i=0;i<nums.length;i++){
            if(storage.containsKey(nums[i])){
               return true;
            }
            storage.put(nums[i],1);
        }
        return false;
    }
}