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
    private static final CardDealer instance = new CardDealer();
    private ArrayList<Monster> unusedMonsters;
    private ArrayList<Monster> usedMonsters;
    private ArrayList<Treasure> unusedTreasures;
    private ArrayList<Treasure> usedTreasures;

    //Construccion del objeto
    private CardDealer(){
        this.unusedMonsters = new ArrayList<>();
        this.usedMonsters = new ArrayList<>();
        this.unusedTreasures = new ArrayList<>();
        this.usedTreasures = new ArrayList<>();
    }

    public static CardDealer getInstance(){
        return instance;
    }

    //Metodos privados
    private void initTreasureCardDeck(){
        this.unusedTreasures.add(new Treasure("¡Sí mi amo!",4,TreasureKind.HELMET));
        this.unusedTreasures.add(new Treasure("Botas de investigación",3,TreasureKind.SHOES));
        this.unusedTreasures.add(new Treasure("Capucha de Cthulhu",3,TreasureKind.HELMET));
        this.unusedTreasures.add(new Treasure("A prueba de babas verdes",2,TreasureKind.ARMOR));
        this.unusedTreasures.add(new Treasure("Botas de lluvia ácida",1, TreasureKind.BOTHHANDS));
        this.unusedTreasures.add(new Treasure("Casco minero", 2, TreasureKind.HELMET));
        this.unusedTreasures.add(new Treasure("Ametralladora Thompson", 4, TreasureKind.BOTHHANDS));
        this.unusedTreasures.add(new Treasure("Camiseta de la UGR", 1, TreasureKind.ARMOR));
        this.unusedTreasures.add(new Treasure("Clavo de rail ferroviario",3, TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Cuchillo de sushi arcano", 2, TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Fez alópodo", 3, TreasureKind.HELMET));
        this.unusedTreasures.add(new Treasure("Hacha prehistórica", 2, TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("El aparato del Pr. Tesla", 4, TreasureKind.ARMOR));
        this.unusedTreasures.add(new Treasure("Gaita", 4, TreasureKind.BOTHHANDS));
        this.unusedTreasures.add(new Treasure("Insecticida", 2, TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Escopeta de 3 cañones", 4, TreasureKind.BOTHHANDS));
        this.unusedTreasures.add(new Treasure("Garabato místico", 2, TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("La rebeca metálica", 2, TreasureKind.ARMOR));
        this.unusedTreasures.add(new Treasure("Lanzallamas", 4, TreasureKind.BOTHHANDS));
        this.unusedTreasures.add(new Treasure("Necro-comicón", 1, TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Necronomicón", 5, TreasureKind.BOTHHANDS));
        this.unusedTreasures.add(new Treasure("Linterna a 2 manos", 3, TreasureKind.BOTHHANDS));
        this.unusedTreasures.add(new Treasure("Necro-gnomicón", 2, TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Necrotelecom", 2, TreasureKind.HELMET));
        this.unusedTreasures.add(new Treasure("Mazo de los antiguos", 3, TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Necro-playboycon", 3, TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Porra preternatural", 2, TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Shogulador", 1, TreasureKind.BOTHHANDS));
        this.unusedTreasures.add(new Treasure("Varita de atizamiento", 2, TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Tentáculo de pega", 2, TreasureKind.HELMET));
        this.unusedTreasures.add(new Treasure("Zapato deja-amigos", 1, TreasureKind.SHOES));

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
