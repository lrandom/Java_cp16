/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session6;

/**
 *
 * @author Lrandom
 */
public class Outer {
    public String name = "Luan";
    public static String nameStatic = "Nam";
    class Inner{
      public void printData(){
          System.out.println(name);
      }
    }
    
    static class InnerStatic{
       public void printData(){
           System.out.println(nameStatic);
       }
    }
    
    public void test(){
        class MethodLocalInner{
           void testInner(){
               System.out.println("test inner");
           }
        }
        
        MethodLocalInner obj = new MethodLocalInner();
        obj.testInner();
    }
    
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printData();
        
        Outer.InnerStatic innerStatic = new Outer.InnerStatic();
        innerStatic.printData();
        
        
    }
}
