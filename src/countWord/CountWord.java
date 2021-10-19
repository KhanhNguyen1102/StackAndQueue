package countWord;

import java.util.Set;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        String str = "No loveeeee!!";
        TreeMap<Character, Integer> map = new TreeMap<>();
        String upperCaseString = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(upperCaseString.charAt(i))) {
                map.put(upperCaseString.charAt(i), 1);
            } else {
                map.put(upperCaseString.charAt(i), map.get(upperCaseString.charAt(i)) + 1);
            }
        }
        Set<Character> keySet = map.keySet();
        for (Character key : keySet) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
