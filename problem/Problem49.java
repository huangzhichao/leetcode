import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem49 {
    public static void main(String[] args) {
        Print.print(groupAnagrams(new String[]{"aaa","ab","ba"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> resultMap = new HashMap<>();
        for (String str : strs){
            int[] count = new int[26];
            for (char c : str.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i=0;i<26;i++){
                if(count[i] != 0){
                    stringBuilder.append((char)(i+'a')).append(count[i]);
                }
            }
            String key  = stringBuilder.toString();
            List<String> list = resultMap.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            resultMap.put(key,list);
        }

        return new ArrayList<List<String>>(resultMap.values());
    }
}
