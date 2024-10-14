public class B14_LongestCommonPrefix {
    public static void main(String[] args) {
        String ss = "a";
        System.out.println(ss.substring(0,1));
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) {
            return strs[0];
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if(strs[i].length() == 1 && result.length() == 1) {
                if (!strs[i].equals(result)) {
                    return "";
                }
            }

            for (int j = 0; j < strs[i].length(); j++) {
                if(strs[i].length() > 1) {
                    if(result.startsWith(strs[i].substring(0, strs[i].length()-j))) {
                        result = strs[i].substring(0,strs[i].length()-j);
                        break;
                    }
                } else {
                    if(result.startsWith(strs[i])) {
                        result = strs[i];
                        break;
                    } else {
                        return "";
                    }
                }
                // if(result.startsWith(strs[i].substring(0, strs[i].length()-j))) {
                //     result = strs[i].substring(0,strs[i].length()-j);
                //     break;
                // }
            }

            if(!result.equals("") && strs[i].equals("")) {
                return "";
            }
        }
        if(result.equals(strs[0]) && !result.equals(strs[1])) {
            return "";
        }
        if(!result.equals(strs[strs.length-1])) {
            return "";
        }
        return result;
    }


    public String longestCommonPrefix2(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        String base = strs[0];
        for (int i = 0; i < base.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if(!base.substring(i,i+1).equals(strs[j].substring(i,i+1)) || i == strs[j].length()) {
                    return base.substring(0, i);
                }
            }
        }
        return base;
    }
}
