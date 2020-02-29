import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MinNumber {
    public void solution(int[] nums){
        int length = nums.length;
        List<String> list = new LinkedList<>();
        for(int i=0;i<length;i++){
            list.add(String.valueOf(nums[i]));
        }
        Collections.sort(list);
        for(int i=0;i<length-1;i++){
            if(list.get(i).length() < list.get(i+1).length()){
                int m = Integer.valueOf(list.get(i)+list.get(i+1));
                int n = Integer.valueOf(list.get(i+1)+list.get(i));
                if(m > n){
                    String tmp = list.get(i);
                    list.set(i,list.get(i+1));
                    list.set(i+1,tmp);
                }
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,54,52,67,68,5,52,17,93,53};
        new MinNumber().solution(nums);
    }
}
