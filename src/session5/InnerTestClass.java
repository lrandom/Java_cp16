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
public class InnerTestClass {
    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            public void stay() {
             
            }
        };
        //car.color = "Red";
        car.kieuDang ="Hi";
        car.soBanhXe = "4";
    }
   
}
