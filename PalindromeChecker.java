import java.util.*;

public class PalindromeChecker {
    public static void main(String args[]) {
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Deque<Character> deque = fillStack(input);
        String reversedString = buildReverse(deque);
        boolean isPalindrome = isPalindrome(input);

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " not a Palindrome");
        }

        scanner.close();
    }

    private static Deque<Character> fillStack(String inputString) {
        Deque<Character> deque = new ArrayDeque<Character>();
        for (char c : inputString.toCharArray()) {
            deque.push(c);
        }
        return deque;
    }

    private static String buildReverse(Deque<Character> deque) {
        StringBuilder reversed = new StringBuilder();
        while (!deque.isEmpty()) {
            reversed.append(deque.pop());
        }
        return reversed.toString();
    }   

    private static boolean isPalindrome(String inputString) {
        String processedInput = inputString.replaceAll("[^a-zA-Z]", "").toLowerCase();
        Deque<Character> deque = fillStack(processedInput);
        
        StringBuilder reversed = new StringBuilder();
        while (!deque.isEmpty()) {
            reversed.append(deque.pop());
        }
        
        return processedInput.equals(reversed.toString());
    }
}