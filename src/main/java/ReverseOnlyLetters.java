public class ReverseOnlyLetters {
    public static String solution(String S){
        int length = S.length();
        if(length == 0){
            return "";
        }
        char[] ch = S.toCharArray();
        int i = 0;
        int j = length-1;
        while(true){
            while((ch[i]<65) || (ch[i]>122) || (ch[i]>90&&ch[i]<97)&&(i<length)){
                i++;
                if(i>=length){
                    break;
                }
            }
            while((ch[j]<65) || (ch[j]>122)||(ch[j]>90&&ch[j]<97)&&(j>i)){
                j--;
                if(j<0){
                    break;
                }
            }
            if(i<j){
                char tmp = ch[j];
                ch[j] = ch[i];
                ch[i] = tmp;
            }
            i++;
            j--;
            if(i>=j){
                break;
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String s = "Czyr^";
        System.out.println("answer:"+solution(s));
    }
}
