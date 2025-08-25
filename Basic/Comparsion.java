import java.util.Scanner;
public class Comparsion {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
            System.out.println("enter the frist number");
            int num1 = x.nextInt();
            System.out.println("enter the second number");
            int num2 = x.nextInt();

                    
                    System.out.println(num1==num2);
                    System.out.println(num1!=num2);
                    System.out.println(num1>=num2);
                    System.out.println(num1<=num2);
                    System.out.println(num1<num2);
                    System.out.println(num1>num2);
        x.close();
    }
}
