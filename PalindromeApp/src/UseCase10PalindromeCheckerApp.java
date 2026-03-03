public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Madam In Eden Im Adam";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrome(normalized, 0, normalized.length() - 1);

        System.out.println("Original String: " + input);

        if (result) {
            System.out.println("Result: It is a Palindrome (Ignoring Case & Spaces).");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }

    // Recursive palindrome logic (reusing UC9 idea)
    public static boolean isPalindrome(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return isPalindrome(str, start + 1, end - 1);
    }
}