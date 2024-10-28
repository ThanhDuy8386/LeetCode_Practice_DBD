public class B125_ValidPalindrome {
    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }

    static boolean isPalindrome(String s) {
        if (s == null)
            return true;
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ||
                    s.charAt(i) >= '0' && s.charAt(i) <= '9' ||
                    s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                s1 += s.charAt(i);
            }
        }
        //System.out.println(s1.toLowerCase());
        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ||
                    s.charAt(i) >= '0' && s.charAt(i) <= '9'
                    ||
                    s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                s2 += s.charAt(i);
            }
        }
        //System.out.println(s2.toLowerCase());
        if (s1.toLowerCase().equals(s2.toLowerCase())) {
            return true;
        }
        return false;
    }
    //done
}
