package AboutClass;
import java.util.Scanner;
public class Class1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000:");
        int num = input.nextInt();

        // Corrected condition to check valid input range
        if (num < 1000 && num > 0) {
            System.out.println("The entered number is correct!");

            int[] array = { num };  // Creating an array (though unnecessary in this case)
            int sum = 0;

            // Looping through the exact length of the array to avoid exceptions
            for (int i = 0; i < array.length; ++i) {
                sum += array[i];
            }
            System.out.println("Sum of array elements: " + sum);
        } else {
            System.out.println("Invalid input. Please enter a number between 0 and 1000.");
        }

        input.close();
    }
}
