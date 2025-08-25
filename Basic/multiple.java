
import java.util.Scanner;
 
public class multiple {
    public static void main(String[]args){
        Scanner n=new Scanner (System.in);
        
        System.out.print("enter the frist number");
         int a=n.nextInt();
         System.out.print("enter the second number");
         int b=n.nextInt();
         int product=a*b;
         System.out.println(a+" and "+b);
         System.out.println("the ppproduct of the two number is ="+product);
         n.close();


    }
}
