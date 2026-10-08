class Solution {
    public int[] replaceElements(int[] arr) {
        int greatest = -1;
        int currgrt = -1;
        for(int i = arr.length -1; i>=0; i--){
            if(arr[i] > currgrt) currgrt = arr[i];
            arr[i] = greatest;
            greatest = Math.max(currgrt, greatest);
        }
        return arr;
    }
}