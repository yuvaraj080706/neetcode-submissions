class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> hmap = new HashMap<>();
       int size = nums.length;

       for(int i=0; i<size; i++){
        int reqval = target-nums[i];
        if(hmap.containsKey(reqval)){
            int index = hmap.get(reqval);
            return new int[]{index,i};
        }
        hmap.put(nums[i],i);
       }
       
       return new int[]{-1,-1};
    }
}
