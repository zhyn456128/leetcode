/**
 * 输入的cont代表连分数的系数（cont[0]代表上图的a0，以此类推）。返回一个长度为2的数组[n, m]，使得连分数的值等于n / m，且n, m最大公约数为1。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：cont = [3, 2, 0, 2]
 * 输出：[13, 4]
 * 解释：原连分数等价于3 + (1 / (2 + (1 / (0 + 1 / 2))))。注意[26, 8], [-13, -4]都不是正确答案。
 * 示例 2：
 *
 * 输入：cont = [0, 0, 3]
 * 输出：[3, 1]
 * 解释：如果答案是整数，令分母为1即可。
 * 限制：
 *
 * cont[i] >= 0
 * 1 <= cont的长度 <= 10
 * cont最后一个元素不等于0
 * 答案的n, m的取值都能被32位int整型存下（即不超过2 ^ 31 - 1）。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/deep-dark-fraction
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class fraction {
    public static int solution(int[] cont,int m){
        int lengh = cont.length;
        if(m == 0){
            return cont[0]+solution(cont,m+1);
        }else if(m>0 && m<lengh-1){
            return 1/(cont[m]+solution(cont,m+1));
        }
        return 1/cont[lengh-1];
    }

    public static void main(String[] args) {
        int[] cont = {1,2,3,4,5,6};
        int result = solution(cont,0);
        System.out.printf("aaaaaaa"+result);
    }
}
