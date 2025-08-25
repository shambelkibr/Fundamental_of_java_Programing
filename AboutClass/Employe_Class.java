package AboutClass;

import java.util.Scanner;
class Employe_Class1 {

    String fname;
    String lname;
    String id;
    int age;
    String Skill;
    
    void display(){
        System.out.print("my name is "+fname +" "+lname );
        System.out.print(" and I am  "+ age +" years old: ");
        System.out.print(" and My skill is "+Skill);
    }
}



public class Employe_Class {
    public static void main(String[] args) {
        Employe_Class1 emp1 = new Employe_Class1();
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the first name");
        emp1.fname = Input.nextLine();

        System.out.println("Enter the last name");
        emp1.lname = Input.nextLine();

        System.out.println("Enter the ID");
        emp1.id = Input.nextLine();

        System.out.println("Enter the Age");
        emp1.age = Input.nextInt();
        Input.nextLine(); // Fix: Consume leftover newline

        System.out.println("Enter the skill");
        emp1.Skill = Input.nextLine();

        emp1.display();
        Input.close();
    }
}
