/*
We can achieve multiple inheritance through interfaces where a class can inherit 
properties of more than one parent class.

*/ 
 
 
 interface Apple{
   abstract void show();   //public + abstract


}
interface Banana{
    void show();   //public + abstract

}
class Fruits implements Apple, Banana{
   public void show(){
        System.out.println("Interface Apple and Banana");

    }

}

public class MultipleInhrit {
    public static void main(String[] args) {
        Fruits f = new Fruits();
        f.show();

        
    }
}
