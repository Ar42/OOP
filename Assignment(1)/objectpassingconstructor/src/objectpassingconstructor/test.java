/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpassingconstructor;

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
       test(test t)
       {
           this.height=t.height;
           this.width=t.width;
       }
       void display()
       {
           System.out.println("Height is "+this.height+" Width is "+this.width);
       }
    
}
