/*
 * Consists of one parent class and one child class.
 */

class Add{
    int a , b, result;
    private String str = "Sannto";
    public double sum(int x, int y){
        a = x;
        b = y;
     return   a + b;
    }
}
class Multiply extends Add{
     public double calculate(){
        a = 7;
        b = 9;
      return result = a * b;
    }

     void print(){
        System.out.println("Calculation is a * b : "+ result);
    }

}
public class SimpleInherit {
    public static void main(String[] args) {
      Multiply m = new Multiply();
        m.calculate();
        m.print();
        //b1.print1();

        double res = m.sum(3, 5);
        System.out.println("Addition is "+res);
         
    }
}
