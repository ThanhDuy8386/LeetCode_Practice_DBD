public class B14 {
    //14. Longest Common Prefix
    public static void main(String[] args) {
        var strs = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    static String longestCommonPrefix(String[] strs) {
        String result = "";
        for(int i = 0; i < strs[0].length(); i++) {
            String temp = strs[0].substring(i, i+1);
            for(int j = 1; j < strs.length; j++) {
                if(i == strs[j].length()) {
                    if(result.length() > 0) {
                        return result;
                    }
                    return "";
                }
                if(!strs[j].substring(i, i+1).equals(temp)) {
                    if(result.length() > 0) {
                        return result;
                    }
                    return "";
                }
            }
            result += temp;
        }
        return result;
    }
}
