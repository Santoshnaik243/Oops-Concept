class Aa{
    int a , b, result;
    private String str = "Sannto";
    public double sum(int x, int y){
        a = x;
        b = y;
     return   a + b;
    }


}
class B1 extends Aa{
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
        B1 b = new B1();
        b.calculate();
        b.print();
        //b1.print1();

        double res = b.sum(3, 5);
        System.out.println(res);
       
        

        

        
    }
}
