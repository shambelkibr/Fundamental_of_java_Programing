import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner num=new Scanner (System.in); 
            System.out.print("enter the integer number = ");
            int numberone = num.nextInt();
            if (numberone%2==0){
                    System.out.println("the number is even");
                }
                else {
                    System.out.println("the number is odd");
                }
        num.close();

    }
}
