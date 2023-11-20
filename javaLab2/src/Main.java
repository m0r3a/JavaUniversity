import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the menu
            System.out.println("Select an option:");
            System.out.println("1. Find common items in two arrays");
            System.out.println("2. Generate Fibonacci sequence");
            System.out.println("3. Check for palindrome");
            System.out.println("4. Exit");

            // Get user choice
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    findCommonItems();
                    break;
                case 2:
                    generateFibonacci();
                    break;
                case 3:
                    checkPalindrome();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void findCommonItems() {
        Scanner scanner = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter elements for the first array (comma-separated): ");
        String[] array1 = scanner.nextLine().split(",");

        // Input for the second array
        System.out.print("Enter elements for the second array (comma-separated): ");
        String[] array2 = scanner.nextLine().split(",");

        // Find and display common items
        System.out.print("Common items in both arrays: ");
        for (String item : array1) {
            for (String item2 : array2) {
                if (item.trim().equals(item2.trim())) {
                    System.out.print(item + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    private static void generateFibonacci() {
        Scanner scanner = new Scanner(System.in);

        // Input for the limit
        System.out.print("Enter the limit for Fibonacci sequence: ");
        int limit = scanner.nextInt();

        // Generate Fibonacci sequence
        int a = 0, b = 1, c;
        System.out.print("Fibonacci sequence up to " + limit + ": ");
        System.out.print(a + " " + b + " ");
        while ((c = a + b) <= limit) {
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    private static void checkPalindrome() {
        Scanner scanner = new Scanner(System.in);

        // Input for the string to check
        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase for case-insensitive comparison
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        // Check for palindrome
        String reversed = new StringBuilder(cleanedInput).reverse().toString();
        if (cleanedInput.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
