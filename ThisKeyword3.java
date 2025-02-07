/*
 * When a local variable and  an instance variable have the same name,
 * this is used to differentiate between them.
 */

public class ThisKeyword3 {
    int a;
    ThisKeyword3(int a){
        this.a = a; 
    }
    void print(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        ThisKeyword3  t = new ThisKeyword3(8);
        //System.out.println(t);
        t.print();

    }
}
