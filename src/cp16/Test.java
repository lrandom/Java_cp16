/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp16;

/**
 *
 * @author Lrandom
 */
public class Test {

    public void test1(Human a){
       a.setEyeColor("Xanh");
    }
    
    public void test2(int a){
       a = 10;
    }
    
    
    public static void main(String[] args) {
        Test test = new Test();
        Human human = new Human();
        human.setEyeColor("Đen");
        test.test1(human);
        System.out.println(human.getEyeColor()); //Xanh
        
        int a = 5;
        test.test2(a);
        System.out.println(a);//5
    }
}
