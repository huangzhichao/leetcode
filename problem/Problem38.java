public class Problem38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        String str = "1";
        for (int i=1;i<n;i++){
            str = countAndSayForPnce(str);
        }
        return str;
    }

    public static String countAndSayForPnce(String in){
        StringBuilder out = new StringBuilder();
        int len = in.length();
        int count = 1;
        char temp = in.charAt(0);
        for (int i=1;i<len;i++){
            char c = in.charAt(i);
            if(temp == c){
                count ++;
            }else{
                out.append(count).append(temp);
                temp = c;
                count = 1;
            }
        }
        if(count != 0){
            out.append(count).append(temp);
        }
        return out.toString();
    }
}
