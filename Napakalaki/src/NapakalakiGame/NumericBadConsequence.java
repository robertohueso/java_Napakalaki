/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

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
}
