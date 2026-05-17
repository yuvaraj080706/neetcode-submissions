class Solution {
    public boolean hasDuplicate(int[] nums) {
        int size = nums.length;
        HashSet<Integer> hmap = new HashSet<>();
        
        for(int i=0; i<size; i++){
            if(hmap.contains(nums[i])){
                return true;
            }
            else{
                hmap.add(nums[i]);
            }
        }

        return false;
    }
}