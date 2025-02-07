/*
 * Where multiple sub classes inherit from a single parent class.
 */

class Birds{
    public void legs(){
        System.out.println("Animals has 2 legs:");
    }

    public void eye(){
        System.out.println("Animals has 2 eyes:");

    }
}
class Kingfisher extends Birds{
    public void eat(){
        System.out.println("Kingfisher eat Fish:");

    }
   
}
class Peacock extends Birds{
    public void run(){
        System.out.println("Cat runs low-level fast:");

    }  
}
class Hen extends Birds{
    public void live(){
        System.out.println("Hen live in house:");

    }
}
public class Hierarchicalinherit {
    public static void main(String[] args) {
        Kingfisher b1 = new Kingfisher();
        b1.legs();
        b1.eye();
        b1.eat();
        Peacock c1 = new Peacock();
        c1.legs();;
        c1.eye();
        c1.run();
        Hen d1 = new Hen();
        d1.legs();
        d1.eye();
        d1.live();
            
    }
}
