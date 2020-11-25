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
public  abstract class Car {
    private String color;
    protected String kieuDang;
    public String soBanhXe;
    protected String so;
    
    public void run(){
        System.out.println("Car running");
    }
    
    public abstract void stay();
}
