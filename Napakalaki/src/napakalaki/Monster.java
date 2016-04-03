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
public class Monster {
    //Datos miembro
    private String name;
    private int combatLevel;
    private Prize prize;
    private BadConsequence badConsequence;
    
    //Constructor
    public Monster(String name, int level, BadConsequence bc, Prize prize){
        this.name = name;
        this.combatLevel = level;
        this.prize = prize;
        this.badConsequence = bc;
    }
    
    //Getters
    public String getName(){
        return this.name;
    }
    
    public int getCombatLevel(){
        return this.combatLevel;
    }
    
    public BadConsequence getBadConsequence(){
        return this.badConsequence;
    }
    
    public int getLevelsGained(){
        return this.prize.getLevels();
    }
    
    public int getTreasuresGained(){
        return this.prize.getTreasures();
    }
    
    //Devuelve el estado en forma de String
    @Override
    public String toString(){
        return "Name = " + this.name +
                " Combat Level = " + Integer.toString(this.combatLevel) +
                " Prize: " + this.prize.toString() +
                " Bad Consequence: " + this.badConsequence.toString();
    }
}
