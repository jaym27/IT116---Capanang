/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm_activity;

/**
 *
 * @author it11617
 */
public class Human{
    
    private String name = "Jay";
    private String race = "Filipino";
    private String skinColor = "light brown";
    private String eyeColor = "brown";
    private String gender = "male";
    private double height = 5.3;
    private double weight = 123.5;
    private int age = 26;
    
    public int intRate = 7;
    public int moodRate = 7;
    public String[] genDis = {"Hypertension", "Cancer", "Physical Deformities"};
    public int wealthRate = 5;
    
    
            
    public static void main(String[] args) {
        
        Human man = new Human();
        //run child
        Children child = new Children();
        System.out.println(man.name);
        System.out.println(child.genDis[1]);
        System.out.println(child.intRate);
        System.out.println(child.moodRate);
        System.out.println(child.wealthRate);
    }
    
}
