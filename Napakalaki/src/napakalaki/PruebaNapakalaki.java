/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author roberto
 */
public class PruebaNapakalaki {
    
    public static ArrayList<Monster> greaterCombatLevel(int level, ArrayList<Monster> monsters){
        ArrayList<Monster> list_of_monsters = new ArrayList<>();
        for(Monster monster : monsters){
            if(monster.getCombatLevel() > 10)
                list_of_monsters.add(monster);
        }
        return list_of_monsters;
    }
    
    public static ArrayList<Monster> levelLoosers(ArrayList<Monster> monsters){
        ArrayList<Monster> list_of_monsters = new ArrayList<>();
        BadConsequence bc;
        
        for(Monster monster : monsters){
            bc = monster.getBadConsequence();
            if(bc.getNHidden() == 0 &&
               bc.getNVisible() == 0 &&
               bc.getSpecificHiddenTreasures().isEmpty() &&
               bc.getSpecificVisibleTreasures().isEmpty() &&
               bc.getLevels() > 0){
                list_of_monsters.add(monster);
            }
        }
        return list_of_monsters;
    }
    
    public static ArrayList<Monster> greaterLevelPrize(int level, ArrayList<Monster> monsters){
        ArrayList<Monster> list_of_monsters = new ArrayList<>();
        Prize prize;
        
        for(Monster monster : monsters){
            prize = monster.getPrize();
            if(prize.getLevel() > level)
                list_of_monsters.add(monster);
        }
        return list_of_monsters;
    }
    
    public static ArrayList<Monster> treasureKindLoosers(TreasureKind treasure, ArrayList<Monster> monsters){
        ArrayList<Monster> list_of_monsters = new ArrayList<>();
        BadConsequence bc;
        
        for(Monster monster : monsters){
            bc = monster.getBadConsequence();
            if(bc.getSpecificVisibleTreasures().contains(treasure) ||
               bc.getSpecificHiddenTreasures().contains(treasure))
                list_of_monsters.add(monster);
        }
        return list_of_monsters;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Monster> monstruos = new ArrayList();

        BadConsequence bc;
        Prize prize;

        //Byakhees
        bc = new BadConsequence("Pierdes tu armadura visible y otra oculta",
                0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        prize =  new Prize(2, 1);
        monstruos.add(new Monster("Byakhees de bonanza", 8, bc, prize));

        //Chibithulhu
        bc = new BadConsequence("Embobados del con el lindo primigeneo te descartas de tu casco visible",
                0, new ArrayList(Arrays.asList(TreasureKind.HELMET)),
                new ArrayList());
        prize =  new Prize(1, 1);
        monstruos.add(new Monster("Chibithulhu", 2, bc, prize));

        //El sopor de Dunwich
        bc = new BadConsequence("El primordial bostezo contagioso. Pierdes el calzado visible",
                0, new ArrayList(Arrays.asList(TreasureKind.SHOES)),
                new ArrayList());
        prize =  new Prize(1, 1);
        monstruos.add(new Monster("El sopor de Dunwich", 2, bc, prize));

        //Angeles de la noche ibicenca
        bc = new BadConsequence("Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",
                0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
                new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
        prize =  new Prize(4, 1);
        monstruos.add(new Monster("Angeles de la noche ibicenca", 14, bc, prize));

        //El gorrón en el umbral
        bc = new BadConsequence("Pierdes todos tus tesoros visibles",
                0, BadConsequence.MAXTREASURES, 0);
        prize =  new Prize(3, 1);
        monstruos.add(new Monster("El gorron en el umbral", 10, bc, prize));

        //H.P Munchcraft
        bc = new BadConsequence("Pierdes la armadura visible",
                0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                new ArrayList());
        prize =  new Prize(2, 1);
        monstruos.add(new Monster("H.P Munchcraft", 6, bc, prize));

        //Bichgooth
        bc = new BadConsequence("Sientes bichos bajo la ropa. Descarta la armadura visible",
                0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                new ArrayList());
        prize =  new Prize(1, 1);
        monstruos.add(new Monster("Bichgooth", 2, bc, prize));

        //El rey rosa
        bc = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles",
                5, 3, 0);
        prize =  new Prize(4, 2);
        monstruos.add(new Monster("El rey rosa", 13, bc, prize));

        //La que redacta en las tinieblas
        bc = new BadConsequence("Toses los pulmones y pierdes 2 niveles",
                2, 0, 0);
        prize =  new Prize(1, 1);
        monstruos.add(new Monster("La que redacta en las tinieblas", 2, bc, prize));

        //Los hondos
        bc = new BadConsequence("Estos monstruos resultan bastante superficiales y te aburren mortalmente. Estas muerto");
        prize =  new Prize(2, 1);
        monstruos.add(new Monster("Los hondos", 8, bc, prize));

        //Semillas de Cthulhu
        bc = new BadConsequence("Pierdes 2 niveles y 2 tesoros ocultos",
                2, 0, 2);
        prize =  new Prize(2, 1);
        monstruos.add(new Monster("Semillas de Cthulhu", 4, bc, prize));

        //Dameargo
        bc = new BadConsequence("Te intentas escaquear. Pierdes 1 mano visible",
                0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
                new ArrayList());
        prize =  new Prize(2, 1);
        monstruos.add(new Monster("Dameargo", 1, bc, prize));

        //Pollipolipo volante
        bc = new BadConsequence("Da mucho asquito. Pierdes 3 niveles",
                3, 0, 0);
        prize =  new Prize(1, 1);
        monstruos.add(new Monster("Pollipolipo volante", 3, bc, prize));

        //Yskhtihyssg-Goth
        bc = new BadConsequence("No le hace gracia que pronuncien mal su nombre. Estas muerto");
        prize =  new Prize(3, 1);
        monstruos.add(new Monster("Yskhtihyssg-Goth", 12, bc, prize));

        //Familia Feliz
        bc = new BadConsequence("La familia te atrapa. Estas muerto");
        prize =  new Prize(4, 1);
        monstruos.add(new Monster("Familia Feliz", 1, bc, prize));

        //Roboggoth
        bc = new BadConsequence("La quinta directiva primaria te obliga a perder 2 niveles y 2 tesoros de una mano visibles",
                2, new ArrayList(Arrays.asList(TreasureKind.ONEHAND, TreasureKind.ONEHAND)),
                new ArrayList());
        prize =  new Prize(2, 1);
        monstruos.add(new Monster("Roboggoth", 8, bc, prize));

        //El espia
        bc = new BadConsequence("Te asusta en la noche. Pierdes 1 casco visible",
                0, new ArrayList(Arrays.asList(TreasureKind.HELMET)),
                new ArrayList());
        prize =  new Prize(1, 1);
        monstruos.add(new Monster("El espia", 5, bc, prize));

        //El lenguas
        bc = new BadConsequence("Menudo susto te llevas. Pierdes 3 niveles y 5 tesoros visibles",
                3, 5, 0);
        prize =  new Prize(1, 1);
        monstruos.add(new Monster("El lenguas", 20, bc, prize));

        //Bicefalo
        bc = new BadConsequence("Te faltan manos para tanta cabeza."
                + "Pierdes 3 niveles y tus tesoros visibles de las manos",
                0, new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS, TreasureKind.ONEHAND, TreasureKind.ONEHAND)),
                new ArrayList());
        prize =  new Prize(1, 1);
        monstruos.add(new Monster("Bicefalo", 20, bc, prize));
        
        //Filtrado de monstruos
        ArrayList<Monster> greater_10_monsters;
        ArrayList<Monster> level_loosers;
        ArrayList<Monster> level_earning_greater_1;
        ArrayList<Monster> onehand_loosers;
        
        greater_10_monsters = greaterCombatLevel(10, monstruos);
        level_loosers = levelLoosers(monstruos);
        level_earning_greater_1 = greaterLevelPrize(1, monstruos);
        onehand_loosers = treasureKindLoosers(TreasureKind.ONEHAND, monstruos);
        
        //Muestra los resultados al aplicar los filtros
        System.out.printf("Monstruos con nivel mayor que 10:\n");
        for(Monster monstruo : greater_10_monsters)
            System.out.printf("\t" + monstruo.toString() + "\n");
        
        System.out.printf("Monstruos que solo pierden nivel con el mal rollo:\n");
        for(Monster monstruo : level_loosers)
            System.out.printf("\t" + monstruo.toString() + "\n");
        
        System.out.printf("Monstruos que ganan mas de 1 nivel con el buen rollo:\n");
        for(Monster monstruo : level_earning_greater_1)
            System.out.printf("\t" + monstruo.toString() + "\n");
        
        System.out.printf("Monstruos que pierden tesoros de 1 mano con el mal rollo:\n");
        for(Monster monstruo : onehand_loosers)
            System.out.printf("\t" + monstruo.toString() + "\n");
    }

}
