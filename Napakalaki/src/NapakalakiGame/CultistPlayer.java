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
public class CultistPlayer extends Player{
    private static int totalCultistPlayers = 0;
    private Cultist myCultistCard;
    
    public CultistPlayer(Player p, Cultist c){
        super(p);
        CultistPlayer.totalCultistPlayers++;
        this.myCultistCard = c;
    }
    
    public static int getTotalCultistPlayers(){
        return CultistPlayer.totalCultistPlayers;
    }
    
    @Override
    public int getCombatLevel(){
        int mitad_combat_level = (int)(0.5*super.getCombatLevel());
        int levels_cultist = this.myCultistCard.getGainedLevels() * CultistPlayer.getTotalCultistPlayers();
        
        return super.getCombatLevel() + mitad_combat_level + levels_cultist;
    }
    
    @Override
    protected int getOponentLevel(Monster m){
        return m.getCombatLevelChangeAgainstCultistPlayer();
    }
    
    @Override
    protected boolean shouldConvert(){
        return false;
    }
    
    @Override
    public String toString(){
        return super.toString() +
                "\n\t Sectario: " + this.myCultistCard.toString();
    }
}