
package AboutClass;
  public class Car {
  
    public static void main(String[] args) {
        
        Car1 myCar=new Car1("Tesla");
        myCar.display(); // Output: Model: Tesla
    } 
}

class Car1 {
        String model;
        Car1(String m) {    
            model = m;
        }
        
        void display() {
            System.out.println("Model: " + model);
        }
    }


