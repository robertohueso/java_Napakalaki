//EXAMEN
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
public class GoodMonster extends Monster{
    private Player friend;
    
    public GoodMonster(String name, int level, BadConsequence bc, Prize prize, Player friend){
        super(name, level, bc, prize);
        this.friend = friend;
    }
    
    public GoodMonster(String name, int level, BadConsequence bc, Prize prize, Player friend, int IC){
        super(name, level, bc, prize, IC);
        this.friend = friend;
    }
    
    public int getCombatLevel(Player aPlayer){
        if(aPlayer == friend)
            return 0;
        else
            return this.combatLevel;
    }
    
    public int getCombatLevelChangeAgainstCultistPlayer(Player aPlayer){
        if(aPlayer == friend)
            return 0;
        else
            return this.combatLevel + this.levelChangeAgainstCultistPlayer;
    }
}
//FIN EXAMEN