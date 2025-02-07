/*  class A{
    int a;
    double b;
   private A(){
     a =2;
     b = 9.43;
     System.out.println(a+" "+ b);
    }
}
*/

//Private constructor declared with the private access modifier.
//that the constructor can only be accessed from within the class itself.
//and not from any other class, including subclass.

public class PvConstructor {

    int a;
    double b;
   private PvConstructor(){
     a = 2;
     b = 9.43;
     System.out.println(a+" "+ b);
    }
    public static void main(String[] args) {
        //A r = new A();
        PvConstructor s1 = new PvConstructor();
        
    }
}
