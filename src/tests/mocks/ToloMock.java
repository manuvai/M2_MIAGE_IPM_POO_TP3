package tests.mocks;

import res.grille.Grille;
import res.tolo.Tolo;

public class ToloMock {
    public Tolo getToloSample() {
        Tolo tolo = new Tolo();

        tolo.setNumerosTires(new int[] {1, 2, 3, 4});
        tolo.ajouterGrille(new Grille(1, 1, new int[] {1, 2, 3, 4}));

        return tolo;
    }
    public Tolo getToloWithoutTirage() {
        Tolo tolo = new Tolo();

        tolo.ajouterGrille(new Grille(1, 1, new int[] {1, 2, 3, 4}));;

        return tolo;
    }
}
