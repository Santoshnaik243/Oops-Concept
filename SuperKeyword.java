/*
 * Super keyword refers to the objects of super class, it is used when we want to call the super class
 * variables, methods, constructors through sub class object.
 */


class SuperKey{
    int a = 243;
    SuperKey(int m, int n){
        int p = m + n;
        System.out.println(p);

    }
    void show(String x){
        System.out.println(x);

    }
}
class SuperKy extends SuperKey{
    int a = 20;
    SuperKy(){
        super(4,8);
        System.out.println("Well come:");

    }

    void show(){
        super.show("Java Programming:");
        System.out.println(a);
        System.out.println(super.a);
    }

}

public class SuperKeyword {
    public static void main(String[] args) {
        SuperKy s1 = new SuperKy();
        s1.show();
        
    }
}
