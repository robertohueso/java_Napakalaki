/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Collections;

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
        this.name = name;
        this.level = 1;
        this.hiddenTreasures = new ArrayList<>();
        this.visibleTreasures = new ArrayList<>();
        this.pendingBadConsequence =  null;
    }
    
    //Metodos privados
    private void bringToLife(){
        this.dead = false;
    }
    
    private int getCombatLevel(){
        int nivel_total = this.level;
        for(Treasure tesoro:this.visibleTreasures){
            nivel_total += tesoro.getBonus();
        }
        return nivel_total;
    }
    
    private void incrementLevels(int l){
        this.level += l;
    }
    
    private void decrementLevels(int l){
        int nuevo_nivel = this.level - l;
        if(nuevo_nivel >= 1)
            this.level = nuevo_nivel;
        else
            this.level = 1;
    }
    
    private void setPendingBadConsequence(BadConsequence b){
        this.pendingBadConsequence = b;
    }
    
    private void applyPrize(Monster m){
        
    }
    
    private void applyBadConsequence(Monster m){
        
    }
    
    private boolean canMakeTreasureVisible(Treasure t){
        //Crea lista de tipos
        ArrayList<TreasureKind> t_kinds = new ArrayList();
        for(Treasure treasure:this.visibleTreasures){
            t_kinds.add(treasure.getType());
        }
        TreasureKind kind = t.getType();
        
        //Comprueba si se puede hacer visible
        if(kind == TreasureKind.ARMOR || kind == TreasureKind.HELMET ||
           kind == TreasureKind.SHOES)
            return !(t_kinds.contains(kind));
        else{
            if(kind == TreasureKind.BOTHHANDS)
                return !(t_kinds.contains(TreasureKind.ONEHAND)) &&
                        !(t_kinds.contains(TreasureKind.BOTHHANDS));
            else{
                return Collections.frequency(t_kinds, kind) <= 1;
            }
        }
    }
    
    private int howManyVisibleTreasures(TreasureKind tKind){
        int total = 0;
        for(Treasure tesoro:this.visibleTreasures){
            if(tesoro.getType() == tKind)
                total++;
        }
        return total;
    }
    
    private void dieIfNoTreasures(){
        if(this.visibleTreasures.isEmpty() && this.hiddenTreasures.isEmpty())
            this.dead = true;
    }
    
    //Metodos publicos
    public String getName(){
        return this.name;
    }
    
    public boolean isDead(){
        return this.dead;
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
        CardDealer dealer = CardDealer.getInstance();
        
        this.visibleTreasures.remove(t);
        dealer.giveTreasureBack(t);
        if(this.pendingBadConsequence != null && !this.pendingBadConsequence.isEmpty())
            this.pendingBadConsequence.substractVisibleTreasure(t);
        this.dieIfNoTreasures();
    }
    
    public void discardHiddenTreasure(Treasure t){
        CardDealer dealer = CardDealer.getInstance();
        
        this.hiddenTreasures.remove(t);
        dealer.giveTreasureBack(t);
        if(this.pendingBadConsequence != null && !this.pendingBadConsequence.isEmpty())
            this.pendingBadConsequence.substractHiddenTreasure(t);
        this.dieIfNoTreasures();
    }
    
    public boolean validState(){
        return this.pendingBadConsequence.isEmpty() && this.hiddenTreasures.size() <= 4;
    }
    
    public void initTreasures(){
        
    }
    
    public int getLevels(){
        return this.level;
    }
    
    public void discardAllTreasures(){
        
    }
}
