public class Rob {
    public static int solution(int[] nums){
        int max = -1;
        int length = nums.length;
        if(length == 0){
            return 0;
        }
        return max(nums,length-1);
    }
    public static int max(int[] nums,int n){
        if(n == 0){
            return  nums[0];
        }
        if(n == 1){
            return Math.max(nums[0],nums[1]);
        }
        if(n == 2){
            return Math.max(nums[0]+nums[2],nums[1]);
        }
        if(max(nums,n-1) == max(nums,n-2)){
            return max(nums,n-2) + nums[n];
        }
        return Math.max(max(nums,n-1),max(nums,n-2)+nums[n]);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{183,219,57,193,94,233,};
        System.out.println("aaaaa:"+solution(nums));
    }
}
