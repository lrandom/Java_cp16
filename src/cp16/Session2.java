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
public class Session2 {
    public static void main(String[] args) {
        int num = 5;
        if(num%2==0){
            System.out.println("Đây là số chẵn");
        }else{
            System.out.println("Đây là số lẻ");
        }
        
        String weather = "troi nang";
        if(weather.equals("troi nang")){
            System.out.println("Đi chơi");
        }else{
            System.out.println("Ở nhà");
        }
        
        
        if(weather.equals("troi nang")){
            System.out.println("Đi học");
        }else if(weather.equals("troi mua")){
            System.out.println("Đi chơi");
        }else if(weather.equals("troi ram")){
            System.out.println("Ngủ");
        }else if(weather.equals("troi bao")){
            System.out.println("Đi chơi");
        }
        
        
        if(num<18){
           if(num>11){
               System.out.println("Ban o trong khoang 11 va 18");
           }
        }
        
        //==>
        if(num<18 && num>11){
             System.out.println("Ban o trong khoang 11 va 18");
        }
        
        switch(num){
            case 5:
                System.out.println("Bạn quá nhỏ tuổi");
                break;
                
            case 6:
                System.out.println("Bạn đủ tuổi đi học lớp 1");
                break;
                
            case 18:
                System.out.println("Bạn đủ tuổi kết hôn");
                break;
                
            default:
                System.out.println("Không có trường hợp nào cả");
        }
        
        //int count = 0;
        //WHILE - DO
        /*while(count<10){
            System.out.println("Hello");
            count++;
        }
        
        //DO - WHILE
        do{
            System.out.println("Hi");
            count++;
        }while(count<10);*/
        
        for (int i = 0; i < 10; i++) {
            if(i==5){
                break;
            }
            System.out.println(i);
        }//0,1,2,3,4
        
           for (int i = 0; i < 10; i++) {
            if(i==5){
               continue;
            }
            System.out.println(i);
        }//0,1,2,3,4,6,7,8,9
        
        
    }
}
