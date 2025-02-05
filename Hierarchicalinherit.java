class Animal{
    public void legs(){
        System.out.println("Animals has 4 legs:");

    }
    public void eye(){
        System.out.println("Animals has 2 eyes:");

    }


}
class Bull extends Animal{
    public void eat(){
        System.out.println("Bull eating grass:");

    }
   

}
class Cat extends Animal{
    public void run(){
        System.out.println("Cat runs mid-level fast:");

    }
    

}
class Dog extends Animal{
    public void live(){
        System.out.println("Dog live in house:");

    }

}
public class Hierarchicalinherit {
    public static void main(String[] args) {
        Bull b1 = new Bull();
        b1.legs();
        b1.eye();
        b1.eat();
        Cat c1 = new Cat();
        c1.legs();;
        c1.eye();
        c1.run();
        Dog d1 = new Dog();
        d1.legs();
        d1.eye();
        d1.live();
        
        
    }
}
