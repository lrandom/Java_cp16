/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp16;

import java.util.Scanner;

/**
 *
 * @author Lrandom
 */
public class CP16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 10;
        
        System.out.println("The number is:"+num);
         
       
        System.out.printf("The number is: %d %d",num,num);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui \"long nhap chuoi vao\" ctrinh");
        String chuoi = scanner.nextLine();
        System.out.println(chuoi);
    }
}
