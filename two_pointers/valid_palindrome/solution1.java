package two_pointers.valid_palindrome;

public class solution1 {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();

        for (char c: s.toCharArray()) { // ''
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        return newStr.toString().equals(newStr.reverse().toString());
    }
}
