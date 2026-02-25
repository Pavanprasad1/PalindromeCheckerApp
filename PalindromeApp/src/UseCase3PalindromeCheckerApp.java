public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {

        String word = "level";   // Example string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("Original String: " + word);
        System.out.println("Reversed String: " + reversed);

        // Compare original and reversed
        if (word.equals(reversed)) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}
