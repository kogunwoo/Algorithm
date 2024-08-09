import java.util.*;

class Solution {
    public int solution(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (isValid(s.substring(i) + s.substring(0, i))) count++;
        return count;
    }

    private boolean isValid(String s) {
        String open = "({[", close = ")}]";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (open.indexOf(c) >= 0) stack.push(c);
            else if (stack.isEmpty() || open.indexOf(stack.pop()) != close.indexOf(c)) return false;
        }
        return stack.isEmpty();
    }
}
