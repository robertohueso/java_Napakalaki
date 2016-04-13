/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author roberto
 */
public class Napakalaki {
    //Variables
    private static final Napakalaki instance = new Napakalaki();
    private int currentPlayerIndex;
    private Monster currentMonster;
    private CardDealer dealer;
    private Player currentPlayer;
    private ArrayList<Player> players;
    
    //Construccion del objeto
    private Napakalaki(){
        this.currentPlayerIndex = -1;
        this.currentMonster = null;
        this.dealer = null;
        this.currentPlayer = null;
        this.players = new ArrayList<>();
    }
    
    public static Napakalaki getInstance(){
        return instance;
    }
    
    //Metodos privados
    private void initPlayers(ArrayList<String> names){
        for(String name:names){
            this.players.add(new Player(name));
        }
    }
    
    private Player nextPlayer(){
        if(this.currentPlayerIndex == -1)
            this.currentPlayerIndex = (new Random().nextInt(this.players.size()));
        else
            this.currentPlayerIndex = (this.currentPlayerIndex + 1) % this.players.size();
            
        this.currentPlayer = this.players.get(this.currentPlayerIndex);
        return this.currentPlayer;
    }
    
    private boolean nextTurnAllowed(){
        return this.currentPlayer.validState();
    }
    
    //Metodos publicos
    public CombatResult developCombat(){
        
    }
    
    public void discardVisibleTreasures(ArrayList<Treasure> treasures){
        
    }
    
    public void discardHiddenTreasures(ArrayList<Treasure> treasures){
        
    }
    
    public void makeTreasuresVisible(ArrayList<Treasure> treasures){
        
    }
    
    public void initGame(ArrayList<String> players){
        
    }
    
    public Player getCurrentPlayer(){
        return this.currentPlayer;
    }
    
    public Monster getCurrentMonster(){
        return this.currentMonster;
    }
    
    public boolean nextTurn(){
        
    }
    
    public boolean endOfGame(CombatResult result){
        return result == CombatResult.WINGAME;
    }
}
