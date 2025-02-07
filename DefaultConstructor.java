import java.util.*;
/*
 * A default constructor is automatically created by the compiler if no other constructors
 * are explicitly defined in the class.
 * It takes no arguments/parameters.
 * It initializes all instance variables to their default values.
 */
class Default{
    Default(){
        System.out.println("I am Default constructor:");
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        Default d1=new Default();
        
    }
    
}
