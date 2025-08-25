package AboutClass;

public class Insideclass {
    

    boolean ison;
    void turnon(){
        ison=true;
        System.out.println("the light is "+ ison);
    }
    void turnoff(){
        ison=false;
        System.out.println("the lighet is "+ this.ison);
    }

    
    public static void main(String[] args) {
        Insideclass light=new Insideclass();
        light.turnoff();
        light.turnon();
        
    }

    
}

