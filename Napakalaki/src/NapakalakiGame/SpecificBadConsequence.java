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
}
