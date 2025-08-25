import java.util.Scanner;
public class swapnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number ");
        int number1 = input.nextInt();
        System.out.println("enter the second number ");
        int number2 = input.nextInt();
        System.out.println("before swaping the number1 and number2 with respectively is = "+number1+ " "+number2); System.out.println("before swaping the number1 and number2 with respectively is = "+number1+ " "+number2);
        // using third variable to exchae the value 
        int temp = number1;
        number1   = number2;
        number2 = temp;
        System.out.println("after swaping the number1 and number2 with respectively is = " + number1 + " " + number2);
        // with out using of the third variable 
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
 System.out.println("after swaping the number1 and number2 with respectively is = " + number1 + " " + number2);
        input.close();
    }
}
