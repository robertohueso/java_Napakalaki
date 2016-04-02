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
public class CardDealer {
    //Variables
    private static final CardDealer instance = null;
    private ArrayList<Monster> unusedMonsters;
    private ArrayList<Monster> usedMonsters;
    private ArrayList<Treasure> unusedTreasures;
    private ArrayList<Treasure> usedTreasures;
    
    //Construccion del objeto
    private CardDealer(){}
    
    public static CardDealer getInstance(){
        return instance;
    }
    
    //Metodos privados
    private void initTreasureCardDeck(){
        
    }
    
    private void initMonsterCardDeck(){
        
    }
    
    private void shuffleTreasures(){
        
    }
    
    private void shuffleMonsters(){
        
    }
    
    //Metodos publicos
    public Treasure nextTreasure(){
        
    }
    
    public Monster nextMonster(){
        
    }
    
    public void giveTreasureBack(Treasure t){
        
    }
    
    public void giveMonsterBack(Monster m){
        
    }
    
    public void initCards(){
        
    }
}
