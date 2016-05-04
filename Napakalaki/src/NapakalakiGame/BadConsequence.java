/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

import java.util.ArrayList;

/**
 *
 * @author roberto
 */
abstract public class BadConsequence {
    //Datos miembro
    static final int MAXTREASURES = 10;
    private String text;
    private int levels;
    
    //Constructor
    public BadConsequence(String text, int levels){
        this.text = text;
        this.levels = levels;
    }
    
    abstract public boolean isEmpty();
    
    public int getLevels(){
        return this.levels;
    }
    
    public String getText(){
        return this.text;
    }
    
    abstract public void substractVisibleTreasure(Treasure t);
    
    abstract public void substractHiddenTreasure(Treasure t);
    
    abstract public BadConsequence adjustToFitTreasureList(ArrayList<Treasure> v, ArrayList<Treasure> h);
    
    //Devuelve el estado en forma de String
    @Override
    public String toString(){
        return this.getText();
    }
}
