package res.mise;

import res.exceptions.InvalidLuckNumberOuterBoundException;
import res.grille.Grille;

public class MiseSuperTolo extends MiseTolo {

    public static final int LOWER_LUCK_NUMBER = 1;
    public static final int UPPER_LUCK_NUMBER = 10;
    private int numeroChance;

    public MiseSuperTolo(int inCode, int inMise, Grille inNumerosChoisis, int inNumeroChance) {
        super(inCode, inMise, inNumerosChoisis);
        setNumeroChance(inNumeroChance);
    }

    private void setNumeroChance(int inNumeroChance) {
        if (inNumeroChance < LOWER_LUCK_NUMBER || inNumeroChance > UPPER_LUCK_NUMBER) {
            throw new InvalidLuckNumberOuterBoundException();
        }
        numeroChance = inNumeroChance;
    }

    public int getNumeroChance() {
        return numeroChance;
    }
}
