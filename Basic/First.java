// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class First {
   public First() {
   }

   public static void main(String[] args) {
      System.out.print("enter the radius of the circle ");
      Scanner var1 = new Scanner(System.in);
      float radius = var1.nextFloat();
      float area = 3.14F *radius * radius;
      System.out.println("---------------the area of the circle is = " + area);
      System.out.print("enter the length of rectangle and the width of the rectangle ");
      float length = var1.nextFloat();
      float width = var1.nextFloat();
      float area2 = length * width;
      System.out.println("----------------the area of the rectangle is = " +area2);
      System.out.print("enter the base and height of the triangle ");
      float height = var1.nextFloat();
      float base = var1.nextFloat();
      float area3= (base * height)/ 2.0F;
      System.out.print("----------------the area of the triangle is = " +area3);
      var1.close();
   }
}


