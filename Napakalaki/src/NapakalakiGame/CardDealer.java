/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
    private ArrayList<Cultist> unusedCultists;

    //Construccion del objeto
    private CardDealer(){
        this.unusedMonsters = new ArrayList<>();
        this.usedMonsters = new ArrayList<>();
        this.unusedTreasures = new ArrayList<>();
        this.usedTreasures = new ArrayList<>();
        this.unusedCultists = new ArrayList<>();
    }

    public static CardDealer getInstance(){
        return instance;
    }

    //Metodos privados
    private void initTreasureCardDeck(){
        this.unusedTreasures.add(new Treasure("¡Sí mi amo!",4,TreasureKind.HELMET));
        this.unusedTreasures.add(new Treasure("Botas de investigación",3,TreasureKind.SHOES));
        this.unusedTreasures.add(new Treasure("Capucha de Cthulhu",3,TreasureKind.HELMET));
        this.unusedTreasures.add(new Treasure("A prueba de babas",2,TreasureKind.ARMOR));
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
        this.unusedTreasures.add(new Treasure("Necro-playboycón", 3, TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Porra preternatural", 2, TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Shogulador", 1, TreasureKind.BOTHHANDS));
        this.unusedTreasures.add(new Treasure("Varita de atizamiento", 3, TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Tentáculo de pega", 2, TreasureKind.HELMET));
        this.unusedTreasures.add(new Treasure("Zapato deja-amigos", 1, TreasureKind.SHOES));
    }

    private void initMonsterCardDeck(){
        BadConsequence bc;
        Prize prize;

        //Byakhees
        bc = new SpecificBadConsequence("Pierdes tu armadura visible y otra oculta",
                0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        prize =  new Prize(2, 1);
        this.unusedMonsters.add(new Monster("Byakhees de bonanza", 8, bc, prize));

        //Chibithulhu
        bc = new SpecificBadConsequence("Embobados del con el lindo primigeneo te descartas de tu casco visible",
                0, new ArrayList(Arrays.asList(TreasureKind.HELMET)),
                new ArrayList());
        prize =  new Prize(1, 1);
        this.unusedMonsters.add(new Monster("Chibithulhu", 2, bc, prize));

        //El sopor de Dunwich
        bc = new SpecificBadConsequence("El primordial bostezo contagioso. Pierdes el calzado visible",
                0, new ArrayList(Arrays.asList(TreasureKind.SHOES)),
                new ArrayList());
        prize =  new Prize(1, 1);
        this.unusedMonsters.add(new Monster("El sopor de Dunwich", 2, bc, prize));

        //Angeles de la noche ibicenca
        bc = new SpecificBadConsequence("Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",
                0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
                new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
        prize =  new Prize(4, 1);
        this.unusedMonsters.add(new Monster("Angeles de la noche ibicenca", 14, bc, prize));

        //El gorrón en el umbral
        bc = new NumericBadConsequence("Pierdes todos tus tesoros visibles",
                0, BadConsequence.MAXTREASURES, 0);
        prize =  new Prize(3, 1);
        this.unusedMonsters.add(new Monster("El gorron en el umbral", 10, bc, prize));

        //H.P Munchcraft
        bc = new SpecificBadConsequence("Pierdes la armadura visible",
                0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                new ArrayList());
        prize =  new Prize(2, 1);
        this.unusedMonsters.add(new Monster("H.P Munchcraft", 6, bc, prize));

        //Bichgooth
        bc = new SpecificBadConsequence("Sientes bichos bajo la ropa. Descarta la armadura visible",
                0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                new ArrayList());
        prize =  new Prize(1, 1);
        this.unusedMonsters.add(new Monster("Bichgooth", 2, bc, prize));

        //El rey rosa
        bc = new NumericBadConsequence("Pierdes 5 niveles y 3 tesoros visibles",
                5, 3, 0);
        prize =  new Prize(4, 2);
        this.unusedMonsters.add(new Monster("El rey rosa", 13, bc, prize));

        //La que redacta en las tinieblas
        bc = new NumericBadConsequence("Toses los pulmones y pierdes 2 niveles",
                2, 0, 0);
        prize =  new Prize(1, 1);
        this.unusedMonsters.add(new Monster("La que redacta en las tinieblas", 2, bc, prize));

        //Los hondos
        bc = new DeathBadConsequence("Estos monstruos resultan bastante superficiales y te aburren mortalmente. Estas muerto");
        prize =  new Prize(2, 1);
        this.unusedMonsters.add(new Monster("Los hondos", 8, bc, prize));

        //Semillas de Cthulhu
        bc = new NumericBadConsequence("Pierdes 2 niveles y 2 tesoros ocultos",
                2, 0, 2);
        prize =  new Prize(2, 1);
        this.unusedMonsters.add(new Monster("Semillas de Cthulhu", 4, bc, prize));

        //Dameargo
        bc = new SpecificBadConsequence("Te intentas escaquear. Pierdes 1 mano visible",
                0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
                new ArrayList());
        prize =  new Prize(2, 1);
        this.unusedMonsters.add(new Monster("Dameargo", 1, bc, prize));

        //Pollipolipo volante
        bc = new NumericBadConsequence("Da mucho asquito. Pierdes 3 niveles",
                3, 0, 0);
        prize =  new Prize(1, 1);
        this.unusedMonsters.add(new Monster("Pollipolipo volante", 3, bc, prize));

        //Yskhtihyssg-Goth
        bc = new DeathBadConsequence("No le hace gracia que pronuncien mal su nombre. Estas muerto");
        prize =  new Prize(3, 1);
        this.unusedMonsters.add(new Monster("Yskhtihyssg-Goth", 12, bc, prize));

        //Familia Feliz
        bc = new DeathBadConsequence("La familia te atrapa. Estas muerto");
        prize =  new Prize(4, 1);
        this.unusedMonsters.add(new Monster("Familia Feliz", 1, bc, prize));

        //Roboggoth
        bc = new SpecificBadConsequence("La quinta directiva primaria te obliga a perder 2 niveles y 2 tesoros de una mano visibles",
                2, new ArrayList(Arrays.asList(TreasureKind.ONEHAND, TreasureKind.ONEHAND)),
                new ArrayList());
        prize =  new Prize(2, 1);
        this.unusedMonsters.add(new Monster("Roboggoth", 8, bc, prize));

        //El espia
        bc = new SpecificBadConsequence("Te asusta en la noche. Pierdes 1 casco visible",
                0, new ArrayList(Arrays.asList(TreasureKind.HELMET)),
                new ArrayList());
        prize =  new Prize(1, 1);
        this.unusedMonsters.add(new Monster("El espia", 5, bc, prize));

        //El lenguas
        bc = new NumericBadConsequence("Menudo susto te llevas. Pierdes 3 niveles y 5 tesoros visibles",
                3, 5, 0);
        prize =  new Prize(1, 1);
        this.unusedMonsters.add(new Monster("El lenguas", 20, bc, prize));

        //Bicefalo
        bc = new SpecificBadConsequence("Te faltan manos para tanta cabeza."
                + "Pierdes 3 niveles y tus tesoros visibles de las manos",
                0, new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS, TreasureKind.ONEHAND, TreasureKind.ONEHAND)),
                new ArrayList());
        prize =  new Prize(1, 1);
        this.unusedMonsters.add(new Monster("Bicefalo", 20, bc, prize));
        
        //Sectarios
        bc = new SpecificBadConsequence("Pierdes 1 mano visible",
                0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)), new ArrayList());
        prize =  new Prize(3, 1);
        this.unusedMonsters.add(new Monster("El mal indecible impronunciable", 10, bc, prize, -2));
        
        bc = new NumericBadConsequence("Pierdes tus tesoros visibles. Jajaja.",
                0, BadConsequence.MAXTREASURES, 0);
        prize =  new Prize(2, 1);
        this.unusedMonsters.add(new Monster("Testigos oculares", 6, bc, prize, 2));
        
        bc = new DeathBadConsequence("Hoy no es tu dia de suerte. Mueres.");
        prize =  new Prize(2, 5);
        this.unusedMonsters.add(new Monster("El gran Cthulhu", 20, bc, prize, 4));
        
        bc = new NumericBadConsequence("Tu gobierno te recorta 2 niveles.",
                2, 0, 0);
        prize =  new Prize(2, 1);
        this.unusedMonsters.add(new Monster("Serpiente Politico", 8, bc, prize, -2));
        
        bc = new SpecificBadConsequence("Pierdes tu casco y tu armadura visible. Pierdes tus manos ocultas.",
                0, new ArrayList(Arrays.asList(TreasureKind.HELMET, TreasureKind.ARMOR)),
                   new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS, TreasureKind.ONEHAND, TreasureKind.ONEHAND)) );
        prize =  new Prize(1, 1);
        this.unusedMonsters.add(new Monster("Felpuggoth", 2, bc, prize, 5));
        
        bc = new NumericBadConsequence("Pierdes 2 niveles",
                2, 0, 0);
        prize =  new Prize(4, 2);
        this.unusedMonsters.add(new Monster("Shoggoth", 16, bc, prize, -4));
        
        bc = new NumericBadConsequence("Pintalabios negro. Pierdes 2 niveles.",
                2, 0, 0);
        prize =  new Prize(1, 1);
        this.unusedMonsters.add(new Monster("Lolitagooth", 2, bc, prize, 3));
    }
    
    private void initCultistCardDeck(){
        this.unusedCultists.add(new Cultist("Agaricus", 1));
        this.unusedCultists.add(new Cultist("Boletus", 2));
        this.unusedCultists.add(new Cultist("Daldinia", 1));
        this.unusedCultists.add(new Cultist("Bolbitius", 2));
        this.unusedCultists.add(new Cultist("Calvatia", 1));
        this.unusedCultists.add(new Cultist("Dermoloma", 1));
    }

    private void shuffleTreasures(){
        Collections.shuffle(this.unusedTreasures);
    }

    private void shuffleMonsters(){
        Collections.shuffle(this.unusedMonsters);
    }
    
    private void shuffleCultists(){
        Collections.shuffle(this.unusedCultists);
    }

    //Metodos publicos
    public Treasure nextTreasure(){
        if(this.unusedTreasures.isEmpty()){
            this.unusedTreasures = new ArrayList(this.usedTreasures);
            this.usedTreasures.clear();
            this.shuffleTreasures();
        }

        return this.unusedTreasures.remove(0);
    }

    public Monster nextMonster(){
        if(this.unusedMonsters.isEmpty()){
            this.unusedMonsters = new ArrayList(this.usedMonsters);
            this.usedMonsters.clear();
            this.shuffleMonsters();
        }

        return this.unusedMonsters.remove(0);
    }
    
    public Cultist nextCultist(){
        return this.unusedCultists.remove(0);
    }

    public void giveTreasureBack(Treasure t){
        this.usedTreasures.add(t);
    }

    public void giveMonsterBack(Monster m){
        this.usedMonsters.add(m);
    }

    public void initCards(){
        this.initTreasureCardDeck();
        this.shuffleTreasures();
        this.initMonsterCardDeck();
        this.shuffleMonsters();
        this.initCultistCardDeck();
        this.shuffleCultists();
    }
}
