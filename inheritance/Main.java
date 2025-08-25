 
 class Animalclass {
    void Makesound(){
        System.out.println("the animal sound");
    }
}

class Cat extends Animalclass{
    void Makesound(){
     System.out.println("the cat sound ");
    }
 }
 

public class Main{
 
 public static void main(String []args){
  
    Cat c=new Cat();
    c.Makesound();

    Animalclass cat=new Cat();
    cat.Makesound();
    

 } 
}

    

