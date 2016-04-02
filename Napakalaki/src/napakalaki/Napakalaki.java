/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

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
        //FIXME Inicializar todo?
        this.players = new ArrayList<>();
    }
    
    public static Napakalaki getInstance(){
        return instance;
    }
    
    //Metodos privados
    private void initPlayers(ArrayList<String> names){
        
    }
    
    private Player nextPlayer(){
        
    }
    
    private boolean nextTurnAllowed(){
        
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
        
    }
    
    public Monster getCurrentMonster(){
        
    }
    
    public boolean nextTurn(){
        
    }
    
    public boolean endOfGame(CombatResult result){
        
    }
}
