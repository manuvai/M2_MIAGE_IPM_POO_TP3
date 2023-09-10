package res.tolo;

import res.grille.GrilleFactory;

public class ToloFactory {

    public static Tolo generateTolo() {

        return new Tolo(GrilleFactory.generateGrille());
    }
}
