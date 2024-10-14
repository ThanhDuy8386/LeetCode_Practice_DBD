import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class B20_ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(isValid2(s)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static boolean isValid2(String s) {
        Stack<String> chars = new Stack<String>();
        //int i = 0;
        if(s.length() % 2 != 0) {
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            String word = String.valueOf(s.charAt(i));
            if(word.equals("(") || word.equals("{") || word.equals("[")) {
                chars.push(word);
            } else {
                if(chars.isEmpty()) {
                    return false;
                }
                if(word.equals(")") && chars.pop().equals("(") 
                || word.equals("}") && chars.pop().equals("{") 
                || word.equals("]") && chars.pop().equals("[")) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if(!chars.isEmpty()) {
            return false;
        }
        return true;
    }
}
//DONE