/*
 * The this keyword is a reference variable that refers to the current object.
 */

class Keyword{
    void show(){
        System.out.println(this);
    }
}
public class ThisKeword {
    public static void main(String[] args) {
        Keyword k1 = new Keyword();
        System.out.println(k1);
        k1.show();
        
    }
}
