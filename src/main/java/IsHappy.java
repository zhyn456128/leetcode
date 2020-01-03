import java.util.LinkedList;
import java.util.List;

public class IsHappy {
    public static boolean solution(int n){
        List<Integer> list = new LinkedList<>();
        int sums = sum(n);
        while(sums != 1){
            if(list.contains(sums)){
                return false;
            }else{
                list.add(sums);
            }
            sums = sum(sums);
        }
        return true;
    }
    public static int sum(int n){
        int sums = 0;
        int tmp = 0;
        while(n != 0){
            tmp = n % 10;
            n = n / 10;
            sums = sums + tmp * tmp;
        }
        return sums;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println("isHappy:"+solution(n));
    }
}
