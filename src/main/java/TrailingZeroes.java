public class TrailingZeroes {
    public static int solution(int n){
        long res = jiecheng(n);
        int count = 0;
        if(res % 10 == 0){
            while(res % 10 == 0){
                count++;
                res /= 10;
            }
            return count;
        }
        return 0;
    }

    public static long jiecheng(int n){
        long res = 1;
        for(int i=1;i<=n;i++){
            res *= i ;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solution(30));
        int a = 3;
        int b = 2;
        System.out.println(a/b);

    }
}
