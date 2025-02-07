 /*
  * A constructor is a special type of method that is used to initialize objects of a class.
   It is called when an object is created using the new keyword.
   A constructor does not have return type. Same name as class name.
  */
 
 
 class InnerConstructor {
    int age; String name;
    InnerConstructor(){
        age = 21; name = "Mixsannt";

    }
         
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
