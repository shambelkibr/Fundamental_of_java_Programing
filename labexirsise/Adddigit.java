package labexirsise;
import java.util.*;
public class Adddigit {
    public static void main(String[] args) {
            System.out.println("enter the number between the 0 and the 1000");
            Scanner input=new Scanner (System.in);
                int number=input.nextInt();
                int sum=0;
                while (number>0) {
                    sum+=number%10;
                    number/=10;
                }
                System.out.println("the  insert number of aal digit sum is : = " + sum);
         input.close();
   }
}
