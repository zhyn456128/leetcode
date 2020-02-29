import java.util.*;

public class Test {
    public static void main(String[] args){
//        Set<Object> set1 =new HashSet<>();
//        set1.add(1);
//        set1.add("what");
//        set1.add('w');
//        System.out.println("set1:"+set1.toString());
//
//        Set<Object> set2 =new HashSet<>();
//        set2.add('w');
//        set2.add(1);
//        set2.add("what");
//        System.out.println("set2:"+set2.toString());
//
//        System.out.println(set1.equals(set2));
//
//        Map<String,String> map = new HashMap<>();
//        Stack<Character> stack = new Stack<>();
//        Queue<Integer> queue = new LinkedList<>();
//
//        stack.push('a');
//        stack.push('b');
//        stack.push('c');
//        for(int i=0;i<stack.size();i++){
//            System.out.println(stack.get(i));
//        }
//
//        String str = "a";
//        System.out.println("str:"+str.hashCode());
//        str = str + "a";
//        System.out.println("str:"+str.hashCode());
//        String str1 = "aa";
//        System.out.println(str == str1);
//        System.out.println(str.equals(str1));
//
//        String s = new String("b");
//        String s1 = s;
//        System.out.println("str:"+s.hashCode());
//        s = s +"aa";
//        System.out.println("str:"+s.hashCode());
//        System.out.println(s == s1);
//        System.out.println(s.equals(s1));
//
//        int x = -123;
//        String str = String.valueOf(x);
//        StringBuffer sb = new StringBuffer(str);
//        StringBuffer sbR = sb.reverse();
//        System.out.println(sb);
//        System.out.println(sbR);
//        System.out.println(sb.equals(sbR));
//
//        List<Integer> list =new ArrayList<>();

        List<Integer> l1 = new LinkedList<>();
        List<Integer> l2 = new LinkedList<>();
        l1.add(-2);
        l1.add(0);
        l1.add(2);
        l2.add(0);
        l2.add(2);
        l2.add(-2);

        System.out.println("answer is :"+l1.containsAll(l2));
        System.out.println("answer is :"+new Test().testIsSame(l1,l2));

    }
    public boolean testIsSame(List l1,List l2){
        if(l1.size() != l2.size()){
            return false;
        }
        Collections.sort(l1);
        Collections.sort(l2);

        for(int i=0;i<l1.size();i++){
            if(!(l1.get(i).equals(l2.get(i)))){
                return false;
            }

        }
        return true;
    }
}
