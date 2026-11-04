class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> num = new HashSet<Integer>();
        int i = 0;
        int n = nums.length;
        for(i = 0; i < n; i++ ){
            if(num.contains(nums[i])){
                return true;
            }
            num.add(nums[i]);
        }
        return false;
    }
}