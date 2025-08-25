import java .util.Scanner;// import the class  of Scanner from utli package
public class Area {
    public static void main(String[] args) {
         Scanner obj=new Scanner (System.in);
            // to calculate the area of the circle
                System.out .print("enter the radius of the circle = ");
                float radius=obj.nextFloat();
                float area_of_circle=3.14f*radius*radius;  //area of circle formula 
                System.out.println("---------------the area of the circle is = "+ area_of_circle);
            // to calculate the area of the rectangle
                    System.out.print("enter the length of rectangle = ") ;
                    float length = obj.nextFloat();
                    System.out.print("enter  the width of the rectangle = ") ;
                    float width=obj.nextFloat();
                    float area_of_rectangle=length*width;  // area of rectangle formula
                    System.out.println("----------------the area of the rectangle is = "+ area_of_rectangle);
            // to calculate the area of the triangle
                    System.out.print("enter the base triangle = ");
                    float Base = obj.nextFloat();
                    System .out.print("enter height of the triangle = ");
                    float Height=obj.nextFloat();
                    float Area_Of_Triangle=(Base*Height)/2;   // formula of the area of triangle
                    System.out.print("----------------the area of the triangle is = "+ Area_Of_Triangle);
         obj.close();
    }
}