class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0, j = nums.length-1, count = 0;
        while(i<=j){
            if(nums[i] == val){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--;
                count++;
            }
            else i++;
        }
        return nums.length - count;
    }
}