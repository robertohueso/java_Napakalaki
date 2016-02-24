/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author roberto
 */
public class BadConsequence {
    //Datos miembro
    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private ArrayList<TreasureKind> specificHiddenTreasures;
    private ArrayList<TreasureKind> specificVisibleTreasures;
    //Constructores
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
        this.text = text;
        this.levels = levels;
        this.nVisibleTreasures = nVisible;
        this.nHiddenTreasures = nHidden;
        this.specificVisibleTreasures = new ArrayList();
        this.specificHiddenTreasures = new ArrayList();
    }
    
    public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible
            , ArrayList<TreasureKind> tHidden){
        this.text = text;
        this.levels = levels;
        this.specificVisibleTreasures = new ArrayList(tVisible);
        this.specificHiddenTreasures = new ArrayList(tHidden);
        this.nHiddenTreasures = tHidden.size();
        this.nVisibleTreasures = tVisible.size();
    }
    
    public BadConsequence(String text){
        this.text = text;
        this.levels = 10;
        this.nVisibleTreasures = 10;
        this.nHiddenTreasures = 10;
        this.specificVisibleTreasures = new ArrayList();
        this.specificHiddenTreasures = new ArrayList();
    }
    
    //Getters basicos
    public String getText(){
        return this.text;
    }
    
    public int getLevels(){
        return this.levels;
    }
    
    public int getNVisible(){
        return this.nVisibleTreasures;
    }
    
    public int getNHidden(){
        return this.nHiddenTreasures;
    }
    
    //Devuelve el estado en forma de String
    @Override
    public String toString(){
        return this.text +
                " Pierde " + Integer.toString(this.levels) + " Niveles, " +
                Integer.toString(this.nVisibleTreasures) + " Objetos Visibles y " +
                Integer.toString(this.nHiddenTreasures) + " Objetos Ocultos.";
    }
}
