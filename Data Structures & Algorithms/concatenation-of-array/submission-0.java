class Solution {
    public int[] getConcatenation(int[] nums) {
        int org_size = nums.length;
        int[] result = new int[org_size*2];
        for(int i=0; i<org_size*2; i++){
            if(i<org_size){
                result[i] = nums[i];
            }
            else{
                result[i] = nums[i-org_size];
            }
        }

        return result;
    }
}