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
public class Car implements ICar,IRunable{

    @Override
    public void run() {
           System.out.println("Running");
    }

    @Override
    public void stay() {
           System.out.println("Staying");
    }

    @Override
    public boolean ableToRun() {
        System.out.println("I can running well");
        return true;
    }
    
    
    public void test(){
        
    }
    
    public void test(int x){
    
    }
    
    public void test(int x, int y){
    
    }
    
    public void test(int x, float y){
    
    }
    
}
