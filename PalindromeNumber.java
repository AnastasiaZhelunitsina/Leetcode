public class PalindromeNumber {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(int x) {
        String stringNumber = String.valueOf(x);
        String reverseString = reverse(stringNumber);

        if (stringNumber.equals(reverseString)) {
            return true;
        } else {
            return false;
        }
    }
}
