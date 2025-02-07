/* Declared using the interface keyword.
Can only contain abstract methods(until java 8) and default methods.
Support multiple inheritance.
 */ 
 
 interface Vehicle {
    String vehicleName = "TVS";  // public + static + final
    int veicleSpeed = 100;       // public + static + final

    void start();            // public + abstract
    void stop();             // public + abstract  
    default void color(){
        System.out.println("red");

    } 
    static void hp(){
        System.out.println("100kmph");
    }

}
class Customer implements Vehicle{
    @Override
    public void start(){
        //vehicleName = "Honda";  // variables are final
        System.out.println("Insert Start button and Start: "+vehicleName); 
        System.out.println("Speed of vehicle "+veicleSpeed); // variables are public
        

    }
    @Override
    public void stop(){
        System.out.println("Press Exit button:");

    }

}

public class Interface {
   public static void main(String[] args) {
    Customer c1 = new Customer();
    c1.start();
    c1.stop();
    c1.color();
    System.out.println(Vehicle.veicleSpeed); // variables are static
    Vehicle.hp();   


        
    }
}
