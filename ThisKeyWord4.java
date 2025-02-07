/*
 * It also called parameterized constructor of it's own class.
 */
class A1{
    A1(){
        this(8888);
    }
    A1(int v){
        System.out.println(v);

    }
}

public class ThisKeyWord4 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        
    }
}
