package res.tolo;

import res.grille.Grille;
import res.mise.MiseSuperTolo;

import java.util.Objects;

public class SuperTolo extends Tolo {

    private int numeroChance;

    public SuperTolo(Grille inNumerosGagnants, int inNumeroChance) {
        super(inNumerosGagnants);
        numeroChance = inNumeroChance;
    }

    public int getNumeroChance() {
        return numeroChance;
    }

    public int obtenirGain(MiseSuperTolo miseSuperTolo) {
        int gain = super.obtenirGain(miseSuperTolo);
        int multiplier = 1;

        if (Objects.nonNull(miseSuperTolo) && numeroChance == miseSuperTolo.getNumeroChance()) {
            multiplier = 5;
        }

        return gain * multiplier;
    }
}
