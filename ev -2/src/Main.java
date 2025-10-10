import java.util.Random;

public class






























Main {
    public static void main(String[] args) {
        int[] A = new int[15];
        Random random = new Random();

        // Fill the array with random integers between 0 and 100
        for (int i = 0; i < 15; i++) {
            A[i] = random.nextInt(101); // 0 to 100 inclusive
        }

        int countDivisibleBy3 = 0;

        // Print the array and count numbers divisible by 3
        System.out.print("Array elements: ");
        for (int elem : A) {
            System.out.print(elem + " ");
            if (elem % 3 == 0) {
                countDivisibleBy3++;
            }
        }

        System.out.println("\nCount of numbers divisible by 3: " + countDivisibleBy3);
    }
}
