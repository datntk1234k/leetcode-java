package LeetCode.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class valid_parentheses {
    public boolean isValid(String s) {
                Deque<Character> stack = new ArrayDeque<>();
        for (char c: s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } if (c == ')') {
                    if (stack.pop() != '(') {
                        return false;
                    }
                } else if (c == ']') {
                    if (stack.pop() != '[') {
                        return false;
                    }
                } else if (c == '}') {
                    if (stack.pop() !=  '{') {
                        return false;
                    }
                }
            }
        } return stack.isEmpty();
    }
}
