
import java.util.Scanner;

public class Extraction {
   
    public static void main(String[]args){
        Scanner n=new Scanner (System.in);
            System.out.print("enter the floating number");
            float num=n.nextFloat();
            int num1=(int)num;
            num=num-num1;
            System.out.println("the fraction value and integer value is respectly is "+num + " and "+num1);
         
         n.close();


    }
}
