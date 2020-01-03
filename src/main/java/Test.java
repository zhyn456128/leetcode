import java.util.*;

public class Test {
    public static void main(String[] args){
        Set<Object> set1 =new HashSet<>();
        set1.add(1);
        set1.add("what");
        set1.add('w');
        System.out.println("set1:"+set1.toString());

        Set<Object> set2 =new HashSet<>();
        set2.add('w');
        set2.add(1);
        set2.add("what");
        System.out.println("set2:"+set2.toString());

        System.out.println(set1.equals(set2));

        Map<String,String> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        stack.push('a');
        stack.push('b');
        stack.push('c');
        for(int i=0;i<stack.size();i++){
            System.out.println(stack.get(i));
        }
    }
}
