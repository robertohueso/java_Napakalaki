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
