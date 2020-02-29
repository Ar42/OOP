/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpassinginstance;

/**
 *
 * @author henrick
 */
public class Objectpassinginstance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        test t1=new test(10,20);
        test t2=new test(20,30);
        test t3=new test(10,20);
        
        t1.isequal(t2);
        t1.isequal(t3);
    }
    
}
