package AboutClass;

class InnerObject {
 boolean ison;
    void turnon(){
        ison=true;
        System.out.println("the light is "+ ison);
    }
    void turnoff(){
        ison=false;
        System.out.println("the lighet is "+ this.ison);
    }
    
}
public class Object {
    public static void main(String[] args) {
        InnerObject light=new InnerObject();
        light.turnoff();
        light.turnon();
        
    }
}
