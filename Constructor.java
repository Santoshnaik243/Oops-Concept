 class InnerConstructor {
    int age; String name;
    /*InnerConstructor(){
        age = 21; name = "Mixsannt";

    }
        */  
    void show(){
        System.out.println(age+" "+name);
    }

    
}


 public class Constructor {

    public static void main(String[] args) {
        InnerConstructor i = new InnerConstructor();
        i.show();
        
    }
}
