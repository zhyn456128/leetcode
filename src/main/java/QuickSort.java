public class QuickSort {
    public static void quickSort(int[] numbers,int left,int right) {
        if (left >= right){
            return;
        }
        int key = numbers[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (numbers[j] >= key && i < j) {
                j--;
            }
            while (numbers[i] <= key && i < j) {
                i++;
            }
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        numbers[left] = numbers[i];
        numbers[i] = key;
        quickSort(numbers, left, i - 1);
        quickSort(numbers, i + 1, right);
    }
    private static void bubbleSort(int nums[]){
        int length = nums.length;
        for(int i=0;i<length;i++){
            for (int j=0;j<length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public static void arrayList(int nums[]){
        System.out.print("[");
        for(int i=0;i<nums.length-1;i++){
            System.out.print(nums[i]+",");
        }
        System.out.print(nums[nums.length-1]);
        System.out.println("]");
    }

    public static void main(String[] args) {
//        int numbers[] = {23,3,1,34,6,8,0,76,88,96,46,3};
        int[] numbers = new int[]{3,43,2,67,0,54,76,23,5};
        System.out.println("排序前：");
        arrayList(numbers);

        quickSort(numbers,0,numbers.length-1);
        System.out.println("快排排序后：");
        arrayList(numbers);

        int numbers1[] = {23,3,1,34,6,8,0,76,88,96,46,3};
        bubbleSort(numbers1);
        System.out.println("冒泡排序后：");
        arrayList(numbers1);
    }
}
