class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing=true;
        boolean decresing=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                increasing=false;
            }
            if(nums[i]<nums[i+1]){
                decresing=false;
            }
        }
        return increasing||decresing;
    }
}
