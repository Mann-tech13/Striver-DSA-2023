package Day12_valid_parenthesis;

import java.util.*;

public class Solution {
    public static boolean isValidParenthesis(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<expression.length(); i++){
            if(expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '['){
                stack.add(expression.charAt(i));
            }
            else{
                if(stack.isEmpty() || (expression.charAt(i) == ']' && stack.peek() != '[') || (expression.charAt(i) == ')' && stack.peek() != '(') || (expression.charAt(i) == '}' && stack.peek() != '{')){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}