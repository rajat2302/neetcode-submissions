class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0, currOne = 0;
        for(int num: nums){
            if(num == 0) currOne = 0;
            else currOne += 1;
            maxOne = Math.max(currOne, maxOne);
        }
        return maxOne;
    }
}