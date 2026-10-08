class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String opr: operations){
            if(opr.equals("+")){
                stack.push(stack.get(stack.size()-1)+stack.get(stack.size()-2));
            } else if(opr.equals("C")) {
                stack.pop();
            } else if(opr.equals("D")) {
                stack.push(2*stack.get(stack.size()-1));
            } else {
                System.out.println(Integer.parseInt(opr));
                stack.push(Integer.parseInt(opr));
            }
        }
        int sum = 0;
        for(int score: stack){
            sum += score;
        }
        return sum;
    }
}