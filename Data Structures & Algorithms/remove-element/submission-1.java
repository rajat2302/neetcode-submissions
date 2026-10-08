class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0, j = nums.length, count = 0;
        while(i<j){
            if(nums[i] == val){
                nums[i] = nums[--j];
                count++;
            }
            else i++;
        }
        return i;
    }
}