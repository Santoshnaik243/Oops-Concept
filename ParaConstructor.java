/*
 * A constructor through which we can pass one or more parameters is called parameterized constructor.
 * These parameters are used to initialize the instance variables of the class when an object is created.
 */
class Inner {
    int a ;
    String s;
    int y;
    Inner(int a1, String b){
        a = a1;
        s=b;
        System.out.println(a+" " +s);

    }
    Inner(int m, int x){
        a = m;
        y = x;
        System.out.println(a+" " + y);
    }
       
}

public class ParaConstructor {
    public static void main(String[] args) {
            Inner ax = new Inner(2, "goofy");
            Inner aj = new Inner(2, 30);
        
    }
}
