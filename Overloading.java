class Addition{
    void print(){
       int  a = 3;
        int b = 5;
        int res = a + b;
        System.out.println(res);

    }
    void print(int x, int y){
      int   result = x+y;
      System.out.println(result);

    }
}
public class Overloading {
    public static void main(String[] args) {
        Addition ax = new Addition();
        ax.print();
        ax.print(4,5 );
        
    }
}
