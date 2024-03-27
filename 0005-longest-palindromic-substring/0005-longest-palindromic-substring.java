class Solution {

    int start, length;

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            searchPalindrome(s, i, i + 1);
            searchPalindrome(s, i, i + 2);
        }
        return s.substring(start, start + length);
    }

    private void searchPalindrome(String str, int s, int e) {
        while (true) {
            if (s < 0 || e >= str.length() || str.charAt(s) != str.charAt(e)) {
                break;
            }
            s--;
            e++;
        }
        if (length < e - s - 1) {
            length = e - s - 1;
            start = s + 1;
        }
    }
}