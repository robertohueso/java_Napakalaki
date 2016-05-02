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
    protected int getCombatLevel(){
        
    }
    
    @Override
    protected int getOponentLevel(Monster m){
        
    }
    
    @Override
    protected boolean shouldConvert(){
        
    }
    
    private Treasure giveMeATreasure(){
        
    }
    
    private boolean canYouGiveMeATreasure(){
        
    }
}