class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        if(s.length() < 2) return false;
        for ( char ch: s.toCharArray()){
            if(ch == '['){
                stack.push(']');
            } else if ( ch == '{' ){
                stack.push('}');
            } else if ( ch == '(') {
                stack.push(')');
            } else {
                if(stack.size() == 0 || stack.peek() != ch) return false;
                else stack.pop();
            }
        }
        if(stack.size() == 0) return true;
        return false;
    }
}
