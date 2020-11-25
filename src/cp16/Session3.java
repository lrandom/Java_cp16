/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp16;

import java.util.StringTokenizer;

/**
 *
 * @author Lrandom
 */
public class Session3 {
    public static void main(String[] args) {
       /*int ages[] = new int[10];
       ages[0]=18;
       ages[1]=20;
       ages[2]=30;
       
       for (int i = 0; i < ages.length; i++) {
          System.out.println(ages[i]);
       }
       
       
       int ages2[] =new int[]{
         1,2,3,4,5,6
       };
       
       for (int i = 0; i < ages2.length; i++) {
          System.out.println(ages[i]);
       }
       
        for (int i : ages2) {
            System.out.println(i); 
        }
        
        
        String names[][] = new String[][]{
            {"Nam","Long","Luan"},
            {"Lam","Linh","Lan"},
            {"Anh","Mai", "Dao"}      
        };
        
        //System.out.println(names[0][0]);//Nam
        //System.out.println(names[2][2]);//Dao
        
        /*for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j]);
            }
        }*/
        
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("Cp 16");
        
        System.out.println(stringBuilder);
        
        //xoa phan tu khoi chuoi
        stringBuilder.delete(0, 1); //elloCP 16
        
        
        System.out.println(stringBuilder);
        
        stringBuilder.insert(1, "eeee");
        System.out.println(stringBuilder);
        
        
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        
       /*StringTokenizer tokens = new StringTokenizer("a+b");
        while (tokens.hasMoreElements()) {
            Object nextElement = tokens.nextElement();
            System.out.println(nextElement);
        }*/
        
        StringTokenizer tokens2 = new StringTokenizer("a+b", "+", false);
        while (tokens2.hasMoreElements()) {
            Object nextElement = tokens2.nextElement();
            System.out.println(nextElement);
        }
    }
}
