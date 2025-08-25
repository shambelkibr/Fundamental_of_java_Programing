class Superclass{
    String name;
    int year;

    Superclass(){

        name="shambel";
        year=2017;   
    }

    Superclass(String Name){
      name=Name;
    }

    Superclass(String Name,int Year){
        name=Name;
        year=Year;
    }

    void Display(){
        System.out.println("My name is "+name +" I am "+year + " old ");
    }
}

public class Constrac{

    public static void main(String []args){
        Superclass object=new Superclass();
           object.Display();
        Superclass obj2=new Superclass("Alem");
           obj2.Display();
        Superclass obj3=new Superclass("Brtukan",2022);
           obj3.Display();

    }
}

