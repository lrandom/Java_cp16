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
public class Button {
    public void onClickListener(EventListener event){
        System.out.println("Click click ");
        event.click();
    }
    
    
    public static void main(String[] args) {
        Button button = new Button();
        button.onClickListener(new EventListener() {
            @Override
            public void click() {
              System.out.print("Callback after click");
            }
        });
        
        button.onClickListener(new EventListener() {
            @Override
            public void click() {
                 //chuyen huong trang
                 System.out.print("Chuyển hướng trang");
            }
        });
    }
}
