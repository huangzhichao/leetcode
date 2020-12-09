public class Problem415 {
    public static void main(String[] args) {
        System.out.println(addStrings("408","5"));
    }

    public static String addStrings(String num1, String num2) {
        int i = num1.length();
        int j = num2.length();
        int k;
        int flag = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while(i>0 || j>0){
            if(i==0){
                k = num2.charAt(j-1)-'0'+flag;
                j--;
            }else if(j==0){
                k = num1.charAt(i-1)-'0'+flag;
                i--;
            }else{
                k = num1.charAt(i-1)-'0'+num2.charAt(j-1)-'0'+flag;
                i--;j--;
            }

            if(k>=10){
                flag = 1;
                k -= 10;
            }else{
                flag = 0;
            }
            stringBuilder.insert(0,(char)(k+'0'));
        }
        if(flag ==1){
            stringBuilder.insert(0,'1');
        }
        return stringBuilder.toString();
    }
}
