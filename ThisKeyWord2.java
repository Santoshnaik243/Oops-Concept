/*
 * You can use this keyword to call another constructor within the same class. 
 */

class Marco{
    Marco(int c, int g){
        //this(777777);
        System.out.println("WELL COME");
    }
    Marco(int b){
        this(5,7);
        System.out.println(b);
    }
}

public class ThisKeyWord2 {
    public static void main(String[] args) {
        Marco m = new Marco(9999);

        
    }
}
