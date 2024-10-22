public class B28_FindTheIndexOfTheFirstOccurenceInAString {
    public static void main(String[] args) {
        
    }

    public int strStr(String haystack, String needle) {
        for(int i = 0; i < haystack.length(); i++) {
            if(i+needle.length() > haystack.length()) {
                return -1;
            }
            if(needle.equals(haystack.substring(i,i+needle.length()))) {
                return i;
            }
        }
        return -1;
    }
    //done
}
