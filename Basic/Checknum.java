import java.util.Scanner;
public class Checknum {
    public static void main(String[] args) {
        Scanner obj  =new Scanner (System.in);
           System.out.print("enter integer of the number = ");
           int number=obj.nextInt();
            if (number<0){
                System.out.println("the integer is negative ");  
            }
            else if (number==0) {
                System.out.println("the integer is zero");
            }
            else{
                System.out.println("the integer is positive");
            }

        obj.close();
    }
}
