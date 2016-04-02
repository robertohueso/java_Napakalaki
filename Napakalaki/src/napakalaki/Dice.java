/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author roberto
 */
public class Dice {
    //Variables
    private static final Dice instance = new Dice();
    
    //Construccion del objeto
    private Dice(){}
    
    public static Dice getInstance(){
        return instance;
    }
    
    //Metodos publicos
    public int nextNumber(){
        
    }
}
