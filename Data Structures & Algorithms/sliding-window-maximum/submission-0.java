class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] maxSub = new int[nums.length -k+1];
        for(int i = 0; i <= nums.length -k; i++ ){
            int currMax = nums[i];
            for(int j = 0; j<k;j++){
                currMax = Math.max(nums[i+j], currMax);
            }
            maxSub[i] = currMax;
        }
        return maxSub;
    }
}
