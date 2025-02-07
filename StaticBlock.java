
/*
 * Initializing static variables.
 * It deals with class.
 * Executed only when the class is first loaded into the memory.
 * static keyword required.
 * Only static variables or methods are access inside static block.
 */

public class StaticBlock {
    //int a = 10; 
    static int b = 2999;
    static{
        //static block
        
        System.out.println(b);
    }
    public static void main(String[] args) {
        //A a1 = new A();
           
    }
}
