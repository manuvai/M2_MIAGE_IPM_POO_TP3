package res;

import res.grille.Grille;
import res.grille.SuperGrille;
import res.tolo.SuperTolo;
import res.tolo.Tolo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getLogger(Main.class.getPackage().getName());

    public static void main(String[] args) {
        // TODO Choisir entre Tolo et SuperTolo => Commenter le jeu non voulu
        jeuTolo();
        log();
        jeuSuperTolo();
    }

    private static void log() {
        log("\n");
    }

    private static void log(Object o) {
        if (Objects.nonNull(o)) {
            String message = (String) o;
            logger.info(message.concat("\n"));

        }
    }

    private static void jeuTolo() {
        log("/****************/");
        log(" * JEU TOLO     * ");
        log("/****************/");

        Tolo tolo = new Tolo();
        tolo.effectuerTirage();

        List<Grille> grilleList = initialiserListeGrille();
        grilleList.forEach(tolo::ajouterGrille);

        log(tolo.obtenirGain(1));
    }

    private static List<Grille> initialiserListeGrille() {
        List<Grille> grilleList = new ArrayList<>();
        grilleList.add(new Grille(1, 5, new int[] {1, 2, 3, 4}));
        return grilleList;
    }

    private static void jeuSuperTolo() {
        log("/******************/");
        log(" * JEU SUPER TOLO * ");
        log("/******************/");

        SuperTolo tolo = new SuperTolo();
        tolo.effectuerTirage();
        tolo.setNumerosTires(new int[] {2, 3, 8, 6});
        tolo.setNumeroChance(4);

        List<SuperGrille> superGrilleList = initialiserListeSuperGrille();
        superGrilleList.forEach(tolo::ajouterGrille);

        log(tolo.obtenirGain(1));

    }

    private static List<SuperGrille> initialiserListeSuperGrille() {
        List<SuperGrille> superGrilleList = new ArrayList<>();
        superGrilleList.add(new SuperGrille(1, 5, new int[] {2, 3, 8, 6}, 4));
        superGrilleList.add(new SuperGrille(1, 5, new int[] {1, 2, 3, 4}, 3));
        return superGrilleList;
    }
}
