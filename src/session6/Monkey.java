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
public class Monkey extends Animal{

    @Override
    public void run() {
        System.out.println("Chạy bằng hai chân");
    }
    
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.run();
    }
}
