//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//
//public class Problem1202 {
//    public static void main(String[] args) {
//        System.out.println(smallestStringWithSwaps("dcab",Arrays.asList(Arrays.asList(0,2), Arrays.asList(1,2))));
//    }
//
//    public static String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
//        List<Set<Integer>> setList = new ArrayList<>();
//        for (List<Integer> pair :pairs){
//            List<Set<Integer>> newSetList = new ArrayList<>();
//
//            Iterator<Set<Integer>> iter = setList.iterator();
//            Set<Integer> newSet = new HashSet<>();
//            while(iter.hasNext()){
//                Set<Integer> set = iter.next();
//                if(set.contains(pair.get(0)) || set.contains(pair.get(1))){
//                    newSet.addAll(set);
//                    newSet.add(pair.get(0));
//                    newSet.add(pair.get(1));
//                }else{
//                    newSetList.add(set);
//                }
//            }
//            if(newSet.isEmpty()){
//                newSet.add(pair.get(0));
//                newSet.add(pair.get(1));
//            }
//            newSetList.add(newSet);
//            setList = newSetList;
//        }
//        Print.print(setList);
//        return "12";
//    }
//}
