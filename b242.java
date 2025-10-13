import java.util.HashMap;

public class b242 {
    //242. Valid Anagram
    public static void main(String[] args) {
        String s1 = "rat";
        String s2 = "car";
        if(isAnagram(s1, s2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    static boolean isAnagram(String s, String t) {
        var map = new HashMap<Character, Integer>();
        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i++) {
            var s1 = s.charAt(i);
            var s2 = t.charAt(i);
            map.put(s1, map.getOrDefault(s1, 0) + 1);
            map.put(s2, map.getOrDefault(s2, 0) - 1);
        }
        for(var val : map.values()) {
            if(val != 0) {
                return false;
            }
        }
        return true;
    }
}
