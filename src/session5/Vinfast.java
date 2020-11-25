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
public class Vinfast extends Car{
    void getKieudang(){
        System.out.println(this.kieuDang);
        //System.out.println(this.color);
        System.out.println(this.soBanhXe);
    }

    @Override
    void stay() {
        System.out.println("Stay");
    }
}
