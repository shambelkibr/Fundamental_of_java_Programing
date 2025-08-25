 
   class inheritance1 {
        int age ;
        String name ;
        void display(){
           System.out.println("my name is "+name+ "and "+ age);  
        }
    }



    class subinheritance1 extends inheritance1{
       void Displlay(){
       System.out.println("hi my name is shambel");
       } 
    }



  public class Innerinheritance1 {

    public static void main(String []args){

      inheritance1 x=new inheritance1();
      x.name="abebe";
      x.age=23;
      x.display();
      
      subinheritance1 y=new subinheritance1();
      y.Displlay();
      
   }
   
}