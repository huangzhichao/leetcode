import java.util.HashMap;
import java.util.Map;

public class Problem290 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog dog dog dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        String[] strArr = s.split(" ");
        if(strArr.length != pattern.length()){
            return false;
        }
        for (int i=0;i<strArr.length;i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(strArr[i])){
                    return false;
                }
            }else{
                if(map.containsValue(strArr[i])){
                    return false;
                }
                map.put(c,strArr[i]);
            }
        }
        return true;
    }
}
