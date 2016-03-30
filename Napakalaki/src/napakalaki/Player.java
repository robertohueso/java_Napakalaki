/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author roberto
 */
public class Player {
    //Variables
    static final int MAXLEVEL = 10;
    private String name;
    private int level;
    private boolean dead = true;
    private ArrayList<Treasure> hiddenTreasures;
    private ArrayList<Treasure> visibleTreasures;
    private BadConsequence pendingBadConsequence;
    
    
    //Constructor
    public Player(String name){
        
    }
    
    //Metodos privados
    private void bringToLife(){
        
    }
    
    private int getCombatLevel(){
        
    }
    
    private void incrementLevels(int l){
        
    }
    
    private void decrementLevels(int l){
        
    }
    
    private void setPendingBadConsequence(BadConsequence b){
        
    }
    
    private void applyPrize(Monster m){
        
    }
    
    private void applyBadConsequence(Monster m){
        
    }
    
    private boolean canMakeTreasureVisible(Treasure t){
        
    }
    
    private int howManyVisibleTreasures(TreasureKind tKind){
        
    }
    
    private void dieIfNoTreasures(){
        
    }
    
    //Metodos publicos
    public String getName(){
        
    }
    
    public boolean isDead(){
        
    }
    
    public ArrayList<Treasure> getHiddenTreasures(){
        
    }
    
    public ArrayList<Treasure> getVisibleTreasures(){
        
    }
    
    public CombatResult combat(Monster m){
        
    }
    
    public void makeTreasureVisible(Treasure t){
        
    }
    
    public void discardVisibleTreasure(Treasure t){
        
    }
    
    public void discardHiddenTreasure(Treasure t){
        
    }
    
    public boolean validState(){

    }
    
    public void initTreasures(){
        
    }
    
    public int getLevels(){
        
    }
    
    public void discardAllTreasures(){
        
    }
}
