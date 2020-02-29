
package objectpassingconstructor;

/**
 *
 * @author henrick
 */
public class Objectpassingconstructor {
    
    public static void main(String[] args) {
        test t1=new test(10,20);
        test t2=new test(t1);
        
        
        t1.display();
        t2.display();
    }
    
}
