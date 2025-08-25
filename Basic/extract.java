import java.util.*;
public class extract {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the integer number");
            float num = x.nextFloat();// accept from user to input 
            int Y = (int) num;//casting from float to integer
            float z = num - Y;// find the fractional value 
            System.out.println("the floating value of "+num +" "+"integer value is = "+ Y+ " the fraction of value is = "+ z);
        x.close();
    }

}
