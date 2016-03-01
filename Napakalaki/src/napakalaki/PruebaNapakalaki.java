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
        bc = new BadConsequence("Embobados del con el lindo primigeneo te descartas"
                + "de tu casco visible",
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
        bc = new BadConsequence("Te atrapan para llevarte de fiesta y te dejan caer"
                + "en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",
                0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
                new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
        prize =  new Prize(4, 1);
        monstruos.add(new Monster("El sopor de Dunwich", 14, bc, prize));
        
        //El gorrón en el umbral
        bc = new BadConsequence("Pierdes todos tus tesoros visibles",
                0, 10, 0);
        prize =  new Prize(3, 1);
        monstruos.add(new Monster("El gorron en el umbral", 10, bc, prize));
        
        //H.P Munchcraft
        bc = new BadConsequence("Pierdes la armadura visible",
                0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                new ArrayList());
        prize =  new Prize(2, 1);
        monstruos.add(new Monster("H.P Munchcraft", 6, bc, prize));
        
        //Bichgooth
        bc = new BadConsequence("Sientes bichos bajo la ropa. Descarta"
                + "la armadura visible",
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
        bc = new BadConsequence("Estos monstruos resultan bastante superficiales"
                + "y te aburren mortalmente. Estas muerto");
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
        bc = new BadConsequence("No le hace gracia que pronuncien mal su nombre."
                + "Estas muerto");
        prize =  new Prize(3, 1);
        monstruos.add(new Monster("Yskhtihyssg-Goth", 12, bc, prize));
        
        //Familia Feliz
        bc = new BadConsequence("La familia te atrapa. Estas muerto");
        prize =  new Prize(4, 1);
        monstruos.add(new Monster("Familia Feliz", 1, bc, prize));
        
        //Roboggoth
        bc = new BadConsequence("La quinta directiva primaria te obliga a perder"
                + "2 niveles y 2 tesoros de una mano visibles",
                2, new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),
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
                0, new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),
                new ArrayList());
        prize =  new Prize(1, 1);
        monstruos.add(new Monster("Bicefalo", 20, bc, prize));
        
        /*
        //monstruos.add()
        Prize prize = new Prize(4, 5);
        BadConsequence badCons = new BadConsequence("Hola esto es una prueba", 4, 8, 7);
        Monster monster = new Monster("Ralph", 5, badCons, prize);
        
        System.out.println(monster.toString());
        */
    }
    
}
