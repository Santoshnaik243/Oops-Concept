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
