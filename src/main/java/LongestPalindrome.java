public class LongestPalindrome {
    public String solution(String s) {
        int length = s.length();
        for(int i=length;i>=1;i--){
            for(int j=0;j<=length-i;j++){
                String tmp = s.substring(j,j+i);
                if(isPalindrome(tmp)){
                    return tmp;
                }
            }
        }
        return "";
    }
    public boolean isPalindrome(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        return sb.toString().equals(s) ? true:false;
    }

    public static void main(String[] args) {
        String s = new String();
//        s = "klvxwqyzugrdoaccdafdfrvxiowkcuedfhoixzipxrkzbvpusslsgfjocvidnpsnkqdfnnzzawzsslwnvvjyoignsfbxkgrokzyusxikxumrxlzzrnbtrixxfioormoyyejashrowjqqzifacecvoruwkuessttlexvdptuvodoavsjaepvrfvbdhumtuvxufzzyowiswokioyjtzzmevttheeyjqcldllxvjraeyflthntsmipaoyjixygbtbvbnnrmlwwkeikhnnmlfspjgmcxwbjyhomfjdcnogqjviggklplpznfwjydkxzjkoskvqvnxfzdrsmooyciwulvtlmvnjbbmffureoilszlonibbcwfsjzguxqrjwypwrskhrttvnqoqisdfuifqnabzbvyzgbxfvmcomneykfmycevnrcsyqclamfxskmsxreptpxqxqidvjbuduktnwwoztvkuebfdigmjqfuolqzvjincchlmbrxpqgguwuyhrdtwqkdlqidlxzqktgzktihvlwsbysjeykiwokyqaskjjngovbagspyspeghutyoeahhgynzsyaszlirmlekpboywqdliumihwnsnwjc";
        s = "fabcdefedcbasdhjfhkfjghdfjkghdfjk";
        String res = new LongestPalindrome().solution(s);
        System.out.println("the answer is:"+res);
    }
}
