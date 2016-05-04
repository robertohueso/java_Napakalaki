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
public class SpecificBadConsequence extends BadConsequence{
    private ArrayList<TreasureKind> specificHiddenTreasures;
    private ArrayList<TreasureKind> specificVisibleTreasures;
    
    //Constructor
    public SpecificBadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible
                                 , ArrayList<TreasureKind> tHidden){
        super(text, levels);
        this.specificVisibleTreasures = new ArrayList(tVisible);
        this.specificHiddenTreasures = new ArrayList(tHidden);
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
    
    @Override
    public boolean isEmpty(){
        return this.specificVisibleTreasures.isEmpty() && this.specificHiddenTreasures.isEmpty();
    }
    
    @Override
    public SpecificBadConsequence adjustToFitTreasureList(ArrayList<Treasure> v, ArrayList<Treasure> h){
        ArrayList<TreasureKind> visibleKind = new ArrayList<>();
        ArrayList<TreasureKind> hiddenKind = new ArrayList<>();
        ArrayList<TreasureKind> visibleToLose = new ArrayList<>();
        ArrayList<TreasureKind> hiddenToLose = new ArrayList<>();
        
        //Copia los tipos de los tesoros.
        for(Treasure treasure:v)
            visibleKind.add(treasure.getType());
        for(Treasure treasure:h)
            hiddenKind.add(treasure.getType());
        
        //Ajusta los tesoros específicos perdidos.
        for(TreasureKind kind:this.specificVisibleTreasures){
            if(Collections.frequency(visibleToLose, kind) < Collections.frequency(visibleKind, kind))
                visibleToLose.add(kind);
        }
        for(TreasureKind kind:this.specificHiddenTreasures){
            if(Collections.frequency(hiddenToLose, kind) < Collections.frequency(hiddenKind, kind))
                hiddenToLose.add(kind);
        }
        return new SpecificBadConsequence(this.getText(), this.getLevels(), visibleToLose, hiddenToLose);
    }
}
