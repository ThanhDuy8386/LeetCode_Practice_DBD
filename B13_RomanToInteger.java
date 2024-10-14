import java.util.HashMap;

public class B13_RomanToInteger {
    public static void main(String[] args) {

    }

    class Solution {
        public int romanToInt(String s) {
            int result = 0;
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            map.put("I", 1);
            map.put("V", 5);
            map.put("X", 10);
            map.put("L", 50);
            map.put("C", 100);
            map.put("D", 500);
            map.put("M", 1000);
            int k = Integer.MAX_VALUE;
            for (int i = 0; i < s.length(); i++) {
                var temp = s.substring(i, i + 1);
                if(i == k) {
                    continue;
                }
                if (i + 2 <= s.length()) {
                    if (temp.equals("I") && s.substring(i + 1, i + 2).equals("V")) {
                        result += 4;
                        k = i+1;
                    } else 
                    if (temp.equals("I") && s.substring(i + 1, i + 2).equals("X")) {
                        result += 9;
                        k = i+1;
                    } else
                    if (temp.equals("X") && s.substring(i + 1, i + 2).equals("L")) {
                        result += 40;
                        k = i+1;
                    } else
                    if (temp.equals("X") && s.substring(i + 1, i + 2).equals("C")) {
                        result += 90;
                        k = i+1;
                    } else 
                    if (temp.equals("C") && s.substring(i + 1, i + 2).equals("D")) {
                        result += 400;
                        k = i+1;
                    } else 
                    if (temp.equals("C") && s.substring(i + 1, i + 2).equals("M")) {
                        result += 900;
                        k = i+1;
                    } else {
                        result += map.get(temp);
                    }
                }
                else {
                    result += map.get(temp);
                }
                //result += map.get(temp);
            }
            return result;
        }
    }
}
