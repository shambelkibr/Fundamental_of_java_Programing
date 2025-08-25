package AboutClass;


class Techer{
    String job="Techer";
    String collegename="Atc";
    void does(){
        System.out.println("Teaching");

    }
}
public class Inhirtitance extends Techer{
String mainsubject="physics";
    public static void main(String[] args) {
        Inhirtitance obj=new Inhirtitance();
        System.out.println(obj.collegename); 
        System.out.println(obj.job); 
        System.out.println(obj.mainsubject); 
    }
}
