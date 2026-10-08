class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> ans = new ArrayList();
        int carry = 0;
        for(int i = digits.length-1; i >=0 ; i--){
            if(i==digits.length-1){
                ans.add((digits[i]+1+carry)%10);
                carry = (digits[i]+1+carry)/10;
            } 
            else{
                ans.add((digits[i]+carry)%10);
                carry = (digits[i]+carry)/10;
            }
        }
        if(carry!= 0){
            ans.add(carry);
        }
        int[] array = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            array[ans.size()-1-i] = ans.get(i);
        }
        return array;
    }
}
