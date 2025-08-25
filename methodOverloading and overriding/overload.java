 class Animal {
    void Eat(){
        System.out.println("animal is eats");
    }
}

class herbivores extends Animal{
    void Eat(){
        System.out.println("animal is plant");
    } 
}



class omnivores extends Animal {
    void Eat(){

        System.out.print("Animal is eat meat");
    }

}

class carnivores extends Animal{
    void Eat(){
        System.out.println("Animal is eat both");
    }
}

public class overload{
  public static void main(String []args){

    Animal A=new Animal();
    Animal o=new omnivores();
    Animal h =new herbivores();
    Animal c=new carnivores();
   
    A.Eat();
    o.Eat();
    h.Eat();
    c.Eat();

  }
}
