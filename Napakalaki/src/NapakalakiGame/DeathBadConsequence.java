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
public class DeathBadConsequence extends NumericBadConsequence{
    //Constructor
    public DeathBadConsequence(String text){
        super(text, Player.MAXLEVEL, BadConsequence.MAXTREASURES, BadConsequence.MAXTREASURES);
    }
}
