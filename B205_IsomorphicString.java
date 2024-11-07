import java.util.HashMap;

public class B205_IsomorphicString {
    public static void main(String[] args) {
        
    }

    public boolean isIsomorphic(String s, String t) {
        HashMap<String, String> map1 = new HashMap<String, String>();
        HashMap<String, String> map2 = new HashMap<String, String>();
        for(int i = 0; i < s.length(); i++) {
            String s1 = s.substring(i, i+1);
            String s2 = t.substring(i, i+1);
            if(map1.get(s1) == null && map2.get(s2) == null) {
                map1.put(s1,s2);
                map2.put(s2,s1);
            } else if(map1.get(s1) != null && !map1.get(s1).equals(s2)) {
                return false;
            } else if(map1.get(s1) == null && map2.get(s2) != null) {
                return false;
            }
        }
        return true;
    }
}
