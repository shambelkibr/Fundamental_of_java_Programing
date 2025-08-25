 import java.util.Scanner;
   
    class Shape {
        

        int getArea(int length,int width){
        return length*width;
        }
      }

    class Rectangle extends Shape{
            int getArea(int length,int width){
            return length*width;
            }
          }

public class InnerShape {
public static void main ( String []args){

            Rectangle A =new Rectangle();
            Scanner input =new Scanner(System.in);

            System.out.println("enter the length of the rectangle");
            int L=input.nextInt();

            System.out.println("enter the width of the rectangle");
            int W=input.nextInt();

            int Area=A.getArea(W,L);

            System.out.println("the area of the rectangle is = "+Area);


            input.close();
        }     
    }




