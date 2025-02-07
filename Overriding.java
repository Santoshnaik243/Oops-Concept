/*
 * Occurs when the method in the subclass must have the same name and parameter list 
  as the method in the super class.
 */

class Bmw{
    void suv(){
        System.out.println("Bmw Sport utility vehicle");

    }
}
class Audi extends Bmw{
    @Override
    void suv(){
        super.suv();
        System.out.println("Audi sport utility vehicle");

    }
}

public class Overriding {
    public static void main(String[] args) {
        //Audi au = new Audi();
        Bmw bw = new Audi();
        bw.suv();
        //au.suv();
        
    }
}
