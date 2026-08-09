public class BigOEx {

    public static int search(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {

            int middle = (left + right) / 2;

            if (numbers[middle] == target) {
                return middle;
            } 
            else if (numbers[middle] < target) {
                left = middle + 1;
            } 
            else {
                right = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;

        int result = search(numbers, target);

        if (result != -1) {
            System.out.println(
                "🔍 " + target + " found at index " + result
            );
        } else {
            System.out.println("❌ Number not found.");
        }
    }
    }
