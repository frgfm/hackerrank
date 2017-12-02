import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    
    public static boolean isBalanced(String expression) {
        HashMap<Character,Character> bracket_dict = new HashMap<>();
        bracket_dict.put('{', '}');
        bracket_dict.put('[', ']');
        bracket_dict.put('(', ')');
        int leng = expression.length();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < leng; i++){
            char temp = expression.charAt(i);
            if (bracket_dict.containsKey(temp)){
                stack.push(bracket_dict.get(temp));
            } else{
                if(stack.empty() || temp != stack.pop()){
                    return false;
                }
            }
        }
        return (stack.empty());
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
