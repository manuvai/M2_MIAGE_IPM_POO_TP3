package res.grille;

import res.exceptions.InvalidLuckNumberOuterBoundException;
import res.tolo.SuperTolo;

public class SuperGrille extends Grille {
    private int numeroChance;

    public SuperGrille(int code, float mise, int[] nombresMises, int inNumeroChance) {
        super(code, mise, nombresMises);
        
        setNumeroChance(inNumeroChance);
    }

    private void setNumeroChance(int inNumeroChance) {
        if (inNumeroChance < SuperTolo.LOWER_LUCK_NUMBER || inNumeroChance > SuperTolo.UPPER_LUCK_NUMBER) {
            throw new InvalidLuckNumberOuterBoundException();
        }
        numeroChance = inNumeroChance;
    }

    public int getNumeroChance() {
        return numeroChance;
    }
}
