/*
 A mechanism in which one class access/acquires all the properties and behaviors of a parent class.
 */


class Father{
    void Responsibility(){
        System.out.println("Himself");

    } 
}
class Son extends Father{
    void Accountability(){
        System.out.println("Family");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.Accountability();
        s1.Responsibility();
       
        
    }
}
