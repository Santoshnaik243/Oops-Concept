class Lion{
    void show(){
        System.out.println("Hii Lion:");
    }

}
class Tiger extends Lion{
    void show(){
        super.show();
        //System.out.println("Hello Tiger:");
    }

}


public class SuperKeyMetho {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.show();
        
    }
}
