/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author roberto
 */
public class BadConsequence {
    //Datos miembro
    static final int MAXTREASURES = 10;
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
        this.nHiddenTreasures = 0;
        this.nVisibleTreasures = 0;
    }
    
    public BadConsequence(String text){
        this.text = text;
        this.levels = 10;
        this.nVisibleTreasures = BadConsequence.MAXTREASURES;
        this.nHiddenTreasures = BadConsequence.MAXTREASURES;
        this.specificVisibleTreasures = new ArrayList();
        this.specificHiddenTreasures = new ArrayList();
    }
    
    //Getters basicos
    public boolean isEmpty(){
        return this.nVisibleTreasures == 0 &&
               this.nHiddenTreasures == 0 &&
               this.specificVisibleTreasures.isEmpty() &&
               this.specificHiddenTreasures.isEmpty();
    }
    
    public int getLevels(){
        return this.levels;
    }
    
    public int getNVisibleTreasures(){
        return this.nVisibleTreasures;
    }
    
    public int getNHiddenTreasures(){
        return this.nHiddenTreasures;
    }
    
    public ArrayList<TreasureKind> getSpecificVisibleTreasures(){
        return (ArrayList<TreasureKind>) this.specificVisibleTreasures.clone();
    }
    
    public ArrayList<TreasureKind> getSpecificHiddenTreasures(){
        return (ArrayList<TreasureKind>) this.specificHiddenTreasures.clone();
    }
    
    public void substractVisibleTreasure(Treasure t){
        this.specificVisibleTreasures.remove(t.getType());
    }
    
    public void substractHiddenTreasure(Treasure t){
        this.specificHiddenTreasures.remove(t.getType());
    }
    
    public BadConsequence adjustToFitTreasureList(ArrayList<Treasure> v, ArrayList<Treasure> h){
        ArrayList<TreasureKind> visibleKind = new ArrayList<>();
        ArrayList<TreasureKind> hiddenKind = new ArrayList<>();
        ArrayList<TreasureKind> visibleToLose = new ArrayList<>();
        ArrayList<TreasureKind> hiddenToLose = new ArrayList<>();
        int nVisible = this.nVisibleTreasures;
        int nHidden = this.nHiddenTreasures;
        
        //Copia los tipos de los tesoros.
        for(Treasure treasure:v)
            visibleKind.add(treasure.getType());
        for(Treasure treasure:h)
            hiddenKind.add(treasure.getType());
        
        //FIXME Asumo que son excuyentes?
        if(this.specificVisibleTreasures.isEmpty() && this.specificHiddenTreasures.isEmpty()){
            //Ajusta la cantidad de tesoros perdidos.
            if(nVisible > v.size())
                nVisible = v.size();
            if(nHidden > h.size())
                nHidden = h.size();
            return new BadConsequence(this.text, this.levels, nVisible, nHidden);
        }
        else{
            //Ajusta los tesoros específicos perdidos.
            for(TreasureKind kind:this.specificVisibleTreasures){
                if(Collections.frequency(visibleToLose, kind) < Collections.frequency(visibleKind, kind))
                    visibleToLose.add(kind);
            }
            for(TreasureKind kind:this.specificHiddenTreasures){
                if(Collections.frequency(hiddenToLose, kind) < Collections.frequency(hiddenKind, kind))
                    hiddenToLose.add(kind);
            }
            return new BadConsequence(this.text, this.levels, visibleToLose, hiddenToLose);
        }
    }
    
    //Devuelve el estado en forma de String
    @Override
    public String toString(){
        return this.text;
    }
}
