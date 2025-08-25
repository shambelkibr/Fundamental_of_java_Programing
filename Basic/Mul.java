import java.util.Scanner;
public class Mul {
    public static void main(String[] args) {
        System.out.print("enter the two number = ");
        Scanner obj = new Scanner(System.in);
            int num1 = obj.nextInt();
            int num2 = obj.nextInt();
            int Mul = num1 * num2;
            System.out.println("the product of the two number is " + num1 + "*" + num2 + "=" + Mul);
        obj.close();
    
    }
}
