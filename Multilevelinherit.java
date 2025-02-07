import java.util.Scanner;
/*
 * Occurs when we have only one super class and multiple sub classes.
 */
class A{
    int a, b;
    int result = 0;
    public  int calculus(){
        a = 4;
        b = 2;
    
        return result = a + b;

    }
    public void display(){
        System.out.println("Addition: "+ result);
    }

}
class B extends A{
    public int operation(){
        return result = a - b;
    }
  public void print(){
    System.out.println("Substraction: "+result);
  }

}
class C extends B{
    public int calculation(){
        return result = a * b;
    }
    void see(){
        System.out.println("Multiplication: "+result);
    }

}
class D extends C{
   public int calculate(){
        System.out.println("Enter two numbers: ");
        Scanner s4 = new Scanner(System.in);
       
         a = s4.nextInt();
         b = s4.nextInt();
        return result = a / b;


    }
    public void show(){
        System.out.println("Division :"+result);
    }
}
public class Multilevelinherit {
    public static void main(String[] args) {
       // B b1 = new B();
         //b1.calculate();
         //b1.print();

        D d1 = new D();
        d1.calculus();
        d1.display();
        d1.operation();
        d1.print();
         d1.calculation();
        d1.see();
       
        d1.calculate();
        d1.show();
       
         
    }
    
}
