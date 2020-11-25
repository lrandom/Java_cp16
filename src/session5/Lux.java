/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session5;

/**
 *
 * @author Lrandom
 */
public class Lux extends Car{
    public void test(){
        System.out.println(this.so);
    }

    @Override
    public void stay() {
        System.out.println("Stay there");
    }
}
