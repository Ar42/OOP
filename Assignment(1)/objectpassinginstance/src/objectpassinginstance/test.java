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
public class test {
    int height;
    int width;
    
    test(int h,int w)
    {
        this.height=h;
        this.width=w;
    }
    void isequal(test t2)
    {
        if(this.height==t2.height && this.width==t2.width)
        {
            System.out.println("Both are same");
        }
        else
        {
            System.out.println("They are different");
        }
    }
    
}
