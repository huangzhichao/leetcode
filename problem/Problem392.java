public class Problem392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("adc","ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        byte[] byteS = s.getBytes();
        byte[] byteT = t.getBytes();
        int i=0,j=0;
        while(j<t.length()&&i<s.length()){
            if(byteS[i] == byteT[j]){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
