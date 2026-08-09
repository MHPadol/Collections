public class EvenAndOdd {

    public static void main(String[] args) {

        int[] numbers = {10, 15, 20, 25, 30, 35, 40, 45};

        System.out.println("=== EVEN AND ODD NUMBER CHECKER ===");
        System.out.println("Numbers in the array:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n");

        // Call the utility methods
        displayEvenNumbers(numbers);
        displayOddNumbers(numbers);
    }

    // Method for finding and displaying even numbers
    public static void displayEvenNumbers(int[] numbers) {

        System.out.println("Even Numbers:");

        for (int number : numbers) {

            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println();
    }

    // Method for finding and displaying odd numbers
    public static void displayOddNumbers(int[] numbers) {

        System.out.println("Odd Numbers:");

        for (int number : numbers) {

            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println();
    }
  
