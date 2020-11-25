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
public class Human {
    
    static String humanMaterial = "Material";
    
    String eyeColor;
    String hairColor;
    float height;
    float weight;
    String skinColor;
    String name;

    public Human() {
        System.out.println("Generate object");
    }
    
    public Human(String eyeColor, String hairColor){
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }
    
    void eat(){
        System.out.println("Eating");
    }
    
    void sleep(){
        System.out.println("Sleeping");
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    public static void main(String[] args) {
        Human thong = new Human();
        //Human.humanMaterial
        /*Human thong = new Human("đen","đen");
        //thong.eyeColor = "Mắt đen";
        thong.setEyeColor("Mắt đen");
        thong.hairColor="Đen";
        thong.height = (float)1.65;
        thong.weight= 59;
        thong.skinColor = "Da vang";
        thong.name = "Thông";
        thong.eat();
        thong.sleep();
        
        Human huy = new Human();
        huy.eyeColor= "Mắt đen";
        huy.hairColor="Đen";
        huy.height =(float)1.63;
        huy.weight = 50;
        huy.skinColor="Da vàng";
        huy.name = "Huy";*/
        
        
    }
}
