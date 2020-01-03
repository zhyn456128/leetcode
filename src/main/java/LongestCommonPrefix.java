public class LongestCommonPrefix {
    public String solution(String[] strs){
        int lenStr = strs.length;
        if(lenStr == 0){
            return "";
        }
        int min = strs[0].length();
        for(int i=0;i<lenStr;i++){
            if(strs[i].length()<min){
                min = strs[i].length();
            }
        }
        int i;
        int j;
        StringBuffer sb = new StringBuffer("");
        // boolean flag = true;
        for(i=0;i<min;i++){
            for(j=1;j<lenStr;j++){
                if(strs[0].charAt(i) != strs[j].charAt(i)){
                    // flag = false;
                    break;
                }
            }
            if(j == lenStr){
                char ch = strs[0].charAt(i);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
