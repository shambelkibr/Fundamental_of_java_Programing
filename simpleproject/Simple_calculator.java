package simpleproject;
import java.util.Scanner;// import the Scanner class for accept impot from the user or key word

public class Simple_calculator {
    public static void main(String[] args) {
         //to delare the object using class is  obiject refference of variable and
        // then after == is called object becase give the memory of Space

        Scanner x = new Scanner(System.in);
            System.out.print("please enter the first number :=");
            float number_1 = x.nextFloat();
            System.out.print("please enter the second number :=");
            float number_2 = x.nextFloat();
        x.close();
           System.out.println();
           float result=add(number_1, number_2);
           System.out.println("the addition of the two number  is =  "+result);

           float result2 = substraction(number_1, number_2);
           System.out.println("the difference of the two number is = " + result2);
           
           float result3 = multiplication(number_1, number_2);
           System.out.println("the product of the two number is = "+result3);

           float result4 = division(number_1, number_2);
           System.out.println("the division of the two number is =  "+result4);


        x.close();
    }

    public static float add(float x, float y) {
        float sum = x + y;
        return sum;
    }
        
    public static float substraction(float x, float y) {
        float difference = x - y;
        return difference;
    }

    public static float multiplication(float x, float y) {
        float Mul = x * y;
        return Mul;
    }
    
    
    public static float division(float x, float y) {
        float Mul = x / y;
        return Mul;
    }    

} 
