class A3{
    int a; String s;
    A3(int x, String y){
      a = x ; 
      s =y;
      System.out.println(a+" "+s);
    }
    A3(A3 ref){
        a = ref.a;
        s = ref.s;
        System.out.println(a+" "+s);


    }

  

}

 public class CpConstructor {
    public static void main(String[] args) {
        A3 r = new A3(10,"hii");
        A3 r2 = new A3(r);
        
    }
}
