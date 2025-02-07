/*
 * A block of code declared directly within the class, outside of any method or constructor.
 * It deals with object.
 * They do not have a name or any parameters.
 * Executed before constructor is called.
 * Executed at the time of object creation.
 * Static and non-static variable can be accessed inside the instance block.
 */

class A2{
    A2(){
        System.out.println("Hello leraner");
    }
    {
        //instance block
        System.out.println("Hii viewer");
    }
    
}

public class InstanceBlock {
    public static void main(String[] args) {
        A2 a = new A2();

    }
}
