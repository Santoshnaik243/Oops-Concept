class Leys{
    Leys(int x){
        System.out.println(x);

    }
}

class Tedemede extends Leys{
    Tedemede(){
        super(0);
        System.out.println("HELLO");
    }
}

public class SuperKeyCons {
    public static void main(String[] args) {
        Tedemede t2 = new Tedemede();

        
    }
}
