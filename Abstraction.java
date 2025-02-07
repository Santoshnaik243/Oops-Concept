/*Abstractin in java is process of hiding the implementation details and showing only the 
essential features of an object. It allows developers to focus on what an object does 
rather than how it does it.
* Abstraction is achieved through abstract and interfaces.
*/

abstract class Animal{
    public void Legs(){
        System.out.println("All Animals have 4 legs:");
        
    }
    abstract void Sound();
    abstract void Eat();

}
class Dog extends Animal{
    @Override
    void Sound(){
        System.out.println("Bow.....");

    }
    @Override
    void Eat(){
        System.out.println("meat........");

    }
}
class Cow extends Animal{
    void Sound(){
        System.out.println("Ho........");

    }
    void Eat(){
        System.out.println("Grass......");

    }
}
public class Abstraction {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cow c1 = new Cow();
        d1.Legs();
        d1.Sound();
        d1.Eat();

        c1.Legs();
        c1.Sound();
        c1.Eat();
        
    }
}
