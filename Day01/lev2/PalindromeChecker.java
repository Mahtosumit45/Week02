public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt the user for input text
        System.out.print("Enter text to check if it's a palindrome: ");
        String inputText = scanner.nextLine();

        // Create a Palindrome object with the provided text
        Palindrome palindrome = new Palindrome(inputText);

        // Display the result of the palindrome check
        if (palindrome.isPalindrome()) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

class Palindrome {
    private String text;

    // Constructor to initialize the text
    public Palindrome(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String s = this.text;

        // Iterate through the string and check if characters from both ends are the same
        for (int i = 0; i < s.length() / 2; i++) {
            // Compare characters from the front and the back
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;  // If characters don't match, it's not a palindrome
            }
        }
        return true;  // If all characters match, it's a palindrome
    }
}
