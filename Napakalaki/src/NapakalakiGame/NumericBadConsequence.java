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
public class NumericBadConsequence extends BadConsequence{
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    
    //Constructor
    public NumericBadConsequence(String text, int levels, int nVisible, int nHidden){
        super(text, levels);
        this.nVisibleTreasures = nVisible;
        this.nHiddenTreasures = nHidden;
    }
    
    public int getNVisibleTreasures(){
        return this.nVisibleTreasures;
    }
    
    public int getNHiddenTreasures(){
        return this.nHiddenTreasures;
    }
    
    @Override
    public void substractVisibleTreasure(Treasure t){
        this.nVisibleTreasures--;
    }
    
    @Override
    public void substractHiddenTreasure(Treasure t){
        this.nHiddenTreasures--;
    }
    
    @Override
    public boolean isEmpty(){
        return this.nVisibleTreasures == 0 && this.nHiddenTreasures == 0;
    }
    
    @Override
    public NumericBadConsequence adjustToFitTreasureList(ArrayList<Treasure> v, ArrayList<Treasure> h){
        ArrayList<TreasureKind> visibleKind = new ArrayList<>();
        ArrayList<TreasureKind> hiddenKind = new ArrayList<>();
        int nVisible = this.nVisibleTreasures;
        int nHidden = this.nHiddenTreasures;
        
        //Copia los tipos de los tesoros.
        for(Treasure treasure:v)
            visibleKind.add(treasure.getType());
        for(Treasure treasure:h)
            hiddenKind.add(treasure.getType());
        
        //Ajusta la cantidad de tesoros perdidos.
        if(nVisible > v.size())
            nVisible = v.size();
        if(nHidden > h.size())
            nHidden = h.size();
        
        return new NumericBadConsequence(this.getText(), this.getLevels(), nVisible, nHidden);
    }
}
