public class ContainsDuplicate {
    public static boolean solution(int[] nums){
        int length = nums.length;
        if(length == 0 || length == 1){
            return false;
        }
        for(int i=0;i<length-1;i++){
            for(int j=i+1;j<length;j++){
                if((nums[i]^nums[j]) == 0){
                    return true;
                }
            }
        }
        return false;
    }
}
