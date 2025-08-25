package AboutClass;

public class Class2 {
    
    int age=23;
    String fname="shambel",lname="Kibre";
    void introduce_Yourself(){
        System.out.println(" my name is "+fname+" "+ lname);
    }

    public static void  main (String []args){
                Class2 name=new Class2();
                name.introduce_Yourself();
    }
}


