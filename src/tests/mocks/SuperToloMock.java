package tests.mocks;

import res.grille.SuperGrille;
import res.tolo.SuperTolo;

public class SuperToloMock {

    public SuperTolo getSuperToloSample() {
        SuperTolo superTolo = new SuperTolo();

        superTolo.setNumerosTires(new int[] {1, 2, 3, 4});
        superTolo.setNumeroChance(9);

        superTolo.ajouterGrille(new SuperGrille(1, 1, new int[] {1, 2, 3, 4}, 9));
        superTolo.ajouterGrille(new SuperGrille(2, 1, new int[] {1, 2, 3, 4}, 5));

        return superTolo;
    }
}
