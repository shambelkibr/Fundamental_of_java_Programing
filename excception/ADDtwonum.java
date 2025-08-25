import java.util.*;
public class ADDtwonum {
    public static void main(String[] args) {
      Scanner c=new Scanner(System.in);
     
      
      
      try {
        System.out.println("enter the frist num") ; 
        int num1 =c.nextInt();
        System.out.println("enter the Second num") ; 
        int num2 =c.nextInt();
        int divission =num1/num2;
        System.out.println(divission);
      } catch (Exception e) {
        System.out.println(e);
      }
      c.close();
    }
}
