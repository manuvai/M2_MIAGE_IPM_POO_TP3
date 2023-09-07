package res.mise;

import res.Grille;

public class MiseSuperTolo extends MiseTolo {

    private int numeroChance;

    public MiseSuperTolo(int inCode, int inMise, Grille inNumerosChoisis, int inNumeroChance) {
        super(inCode, inMise, inNumerosChoisis);
        numeroChance = inNumeroChance;
    }

    public int getNumeroChance() {
        return numeroChance;
    }
}
