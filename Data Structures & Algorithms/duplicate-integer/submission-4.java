class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> storage=new HashSet();

        for(int i=0;i<nums.length;i++){
            if(storage.contains(nums[i])){
               return true;
            }
            storage.add(nums[i]);
        }
        return false;
    }
}