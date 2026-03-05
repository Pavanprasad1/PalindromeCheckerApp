// Service class that contains palindrome logic
class PalindromeChecker {

    public boolean checkPalindrome(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {

            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}


// Main application class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "radar";

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(word);

        System.out.println("Input String: " + word);

        if (result) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}