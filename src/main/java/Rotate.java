public class Rotate {
    //递归
    public static void solution(int[] nums,int k){
        if(k == 0){
            return;
        }
        solution(nums,k-1);
        int tmp = nums[nums.length-1];
        for(int i=nums.length-1;i>0;i--){
            nums[i] = nums[i-1];
        }
        nums[0] = tmp;
    }
    //非递归
    public static void solution1(int[] nums, int k) {
        int length = nums.length;
        int tmp = nums[length-k-1];
        int last = length-1;
        for(int i=length-k-1;i>=0;i--){
            for(int j=0;j<k;j++){
                nums[i+j] = nums[i+j+1];
                last = i+j+1;
            }
            nums[last] = tmp;
            if(i-1 >= 0){
                tmp = nums[i-1];
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        solution1(nums,3);
        for(int tmp : nums){
            System.out.printf(tmp+" ");
        }
        System.out.println("");
    }
}
