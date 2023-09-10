package res;

import res.mise.MiseSuperTolo;
import res.mise.MiseTolo;
import res.tolo.SuperToloFactory;
import res.tolo.Tolo;
import res.tolo.ToloFactory;

public class Jeu {

    public static void main(String[] args) {
        // Choix du type de jeu
        TypeJeu typeJeu = TypeJeu.TOLO;

        // Initialisation du jeu
        Tolo tolo;
        if (typeJeu.equals(TypeJeu.TOLO)) {
            tolo = ToloFactory.generateTolo();
        } else {
            tolo = SuperToloFactory.generateSuperTolo();
        }

        // Initialisation de mise

    }
}
