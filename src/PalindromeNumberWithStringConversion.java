public class PalindromeNumberWithStringConversion {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String s = String.valueOf(x);

        int length = s.length();
        int l = 0;
        int r = length - 1;

        while (l <= r && r > 0 && r < length) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
