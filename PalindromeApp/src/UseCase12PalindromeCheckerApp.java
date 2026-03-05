import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;


// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}


// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


// Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}


// Main Application
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "racecar";

        // Choose strategy dynamically
        PalindromeStrategy strategy = new DequeStrategy();

        boolean result = strategy.checkPalindrome(word);

        System.out.println("Input String: " + word);

        if (result) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}