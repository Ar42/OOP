/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpassingstatic;

public class Objectpassingstatic {

    public static void main(String[] args) {
        test t1=new test(10,20);
        test t2=new test(20,20);
        
        if(test.isequal(t1, t2)==1)
        {
            System.out.println("Same Height and Same Width");
        }
        if(test.isequal(t1, t2)==2)
        {
            System.out.println("Same Height and Different Width");
        }
        if(test.isequal(t1, t2)==3)
        {
            System.out.println("Different Height and Same Width");
        }
        if(test.isequal(t1, t2)==4)
        {
            System.out.println("Different Height and Different Width");
        }
    }
    
}
