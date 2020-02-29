/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpassingstatic;

/**
 *
 * @author henrick
 */
public class test {
    int height,width;
    test(int h,int w)
    {
        this.height=h;
        this.width=w;
    }
    static int isequal(test x,test y)
    {
        if(x.height==y.height && x.width==y.width)
        {
            return 1;
        }
        if(x.height==y.height && x.width!=y.width)
        {
            return 2;
        }
        if(x.height!=y.height && x.width==y.width)
        {
            return 3;
        }
        else 
            return 4;

    }
}
