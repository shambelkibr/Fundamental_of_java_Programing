import java.util.Scanner;
public class Arthematic_operate {
    public static void main(String[] args) {
      
        Scanner x = new Scanner(System.in);
            System.out.print("enter the integer number ");
                float A = x.nextFloat();
            System.out.print("enter the second integer number ");
                float B = x.nextFloat();
                float sum = A + B;
                float difference = A - B;
                float product = A * B;
                float quetiont = A / B;
                float REmeder = A % B;
            System.out.println("the Arthematical operation of the above is " +"sum = "+sum+" " +" product is = "+product);
            System.out.println("the difference is = "+difference+" the question is = "+quetiont +" and"+ " the remender is = "+REmeder);
        
        x.close();

    }
}
