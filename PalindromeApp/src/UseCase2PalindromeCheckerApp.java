public class UseCase2PalindromeCheckerApp {

        public static void main(String[] args) {

            // Hardcoded string
            String word = "madam";

            String reversed = "";

            // Reverse the string
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed = reversed + word.charAt(i);
            }

            System.out.println("Hardcoded String: " + word);

            if (word.equals(reversed)) {
                System.out.println("Result: It is a Palindrome.");
            } else {
                System.out.println("Result: It is NOT a Palindrome.");
            }
        }
    }

