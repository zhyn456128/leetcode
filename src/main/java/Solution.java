class Solution {
    public boolean buddyStrings(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
        if(lenA != lenB){
            return false;
        }
        if(A.equals(B)){
            for(int i=0;i<lenA-1;i++){
                for(int j=i+1;j<lenA;j++){
                    if(A.charAt(i) == B.charAt(j)){
                        return true;
                    }
                }
            }
        }
        int sum = 0;
        int  tmp1 = -1,tmp2 = -1;
        for(int i=0;i<lenA;i++){
            if(A.charAt(i) != B.charAt(i)){
                sum++;
                if(sum == 1){
                    tmp1 = i;
                }
                if(sum == 2){
                    tmp2 = i;
                }
            }
        }
        if(sum != 2){
            return false;
        }
        if((A.charAt(tmp1) == B.charAt(tmp2)) && (A.charAt(tmp2) == B.charAt(tmp1))){
            return true;
        }
        return false;
    }
}