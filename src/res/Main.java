package res;

import res.grille.Grille;
import res.grille.SuperGrille;
import res.tolo.SuperTolo;
import res.tolo.Tolo;

public class Main {

    public static void main(String[] args) {
        // TODO Choisir entre Tolo et SuperTolo => Commenter le jeu non voulu
        jeuTolo();
        jeuSuperTolo();
    }

    private static void jeuTolo() {
        System.out.println("/****************/");
        System.out.println(" * JEU TOLO     * ");
        System.out.println("/****************/");
        Tolo tolo = new Tolo();
        tolo.effectuerTirage();

        tolo.ajouterGrille(new Grille(1, 5, new int[] {1, 2, 3, 4}));

        System.out.println(tolo.obtenirGain(1));
    }

    private static void jeuSuperTolo() {
        System.out.println("/******************/");
        System.out.println(" * JEU SUPER TOLO * ");
        System.out.println("/******************/");
        SuperTolo tolo = new SuperTolo();
        tolo.effectuerTirage();

        tolo.ajouterGrille(new SuperGrille(1, 5, new int[] {1, 2, 3, 4}, 3));

        System.out.println(tolo.obtenirGain(1));

    }
}
