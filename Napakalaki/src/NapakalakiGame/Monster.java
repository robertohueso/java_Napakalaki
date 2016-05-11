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
public class Monster {
    //Datos miembro
    //EXAMEN
    protected String name;
    protected int combatLevel;
    protected Prize prize;
    protected BadConsequence badConsequence;
    protected int levelChangeAgainstCultistPlayer = 0;
    //FIN EXAMEN
    
    //Constructor
    public Monster(String name, int level, BadConsequence bc, Prize prize){
        this.name = name;
        this.combatLevel = level;
        this.prize = prize;
        this.badConsequence = bc;
    }
    
    public Monster(String name, int level, BadConsequence bc, Prize prize, int IC){
        this.name = name;
        this.combatLevel = level;
        this.prize = prize;
        this.badConsequence = bc;
        this.levelChangeAgainstCultistPlayer = IC;
    }
    
    //Getters
    public String getName(){
        return this.name;
    }
    
    public int getCombatLevel(){
        return this.combatLevel;
    }
    
    public int getCombatLevelChangeAgainstCultistPlayer(){
        return this.getCombatLevel() + this.levelChangeAgainstCultistPlayer;
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
        return "Nombre: " + this.name +
                "\n\t Combat Level = " + Integer.toString(this.combatLevel) +
                "\n\t Prize: " + this.prize.toString() +
                "\n\t Bad Consequence: " + this.badConsequence.toString();
    }
}
