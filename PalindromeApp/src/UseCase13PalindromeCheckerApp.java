public class UseCase13PalindromeCheckerApp {

    // Reverse String Method
    public static boolean reverseMethod(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        return word.equals(reversed);
    }


    // Two-pointer Method
    public static boolean twoPointerMethod(String word) {

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


    public static void main(String[] args) {

        String word = "racecar";

        // Measure reverse method time
        long startTime1 = System.nanoTime();
        boolean result1 = reverseMethod(word);
        long endTime1 = System.nanoTime();

        long reverseTime = endTime1 - startTime1;


        // Measure two pointer method time
        long startTime2 = System.nanoTime();
        boolean result2 = twoPointerMethod(word);
        long endTime2 = System.nanoTime();

        long pointerTime = endTime2 - startTime2;


        System.out.println("Input String: " + word);

        System.out.println("\nReverse Method Result: " + result1);
        System.out.println("Execution Time: " + reverseTime + " ns");

        System.out.println("\nTwo Pointer Method Result: " + result2);
        System.out.println("Execution Time: " + pointerTime + " ns");
    }
}