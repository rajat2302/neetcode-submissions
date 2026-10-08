class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i= 0; i<n; i++){
            int nextInd=i+n;
            ans[i] = nums[i];
            ans[nextInd] = nums[i];
        }
        return ans;
    }
}