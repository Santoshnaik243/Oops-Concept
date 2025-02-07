
 class Appl {
    int a = 10;
 
}

class Banan extends Appl{
      int a = 20;
      void show(){
        System.out.println(a);
        System.out.println(super.a);
      }
}

public class SuperKeyVar {
    public static void main(String[] args) {
        Banan b1 = new Banan();
        b1.show();
        
    }
    
}
