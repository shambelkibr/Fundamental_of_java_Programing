import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);// to accept the mark of the student 
        System.out.print("enter the mark of student subject one = ");
        float Mark1 = mark.nextFloat();
            System.out.print("enter the mark of student subject two = ");
            float Mark2 = mark.nextFloat();
            System.out.print("enter the mark of student subject three = ");
            float Mark3 = mark.nextFloat();
            float Total_mark = (Mark1 + Mark2 + Mark3)/3;// to calculate the average mark of student
            System.out.println("the average of mark is "+Total_mark);
        mark.close();
    }
}