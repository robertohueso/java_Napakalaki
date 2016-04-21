/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

import java.util.Random;

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
        return (new Random().nextInt(6) + 1);
    }
}
