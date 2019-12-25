import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class longestValidBracket {
    public static int longestValidParentheses(String s) {
        int max = 0;
        char[] chars = s.toCharArray();
        int length = s.length();
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<length;i++){
            if(chars[i] == '('){
                stack.push(i);
            }else if(chars[i] == ')'){
                if(stack.empty()){
                    stack.push(i);
                }else if(chars[stack.peek()] == '('){
                    stack.pop();
                }else{
                    stack.push(i);
                }
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        while(!stack.empty()){
            list.add(stack.peek());
            stack.pop();
        }
        Collections.sort(list);
        int listSize = list.size();
        if(listSize == 0){
            return length;
        }
        for(int i=0;i<listSize-1;i++){
            max = list.get(i+1)-list.get(i)-1>max?list.get(i+1)-list.get(i)-1:max;
        }
        max = length-1-list.get(listSize-1)-1>max?length-1-list.get(listSize-1)-1:max;
        max = list.get(0)>max?list.get(0):max;
        return max;
    }

    public static void main(String[] args) {
        String s = "(()";
        int max = longestValidBracket.longestValidParentheses(s);
        System.out.println(s);
        System.out.println(max);
    }
}
