package res.grille;

import res.validator.SuperGrilleValidator;

public class SuperGrille extends Grille {
    private int numeroChance;
    private SuperGrilleValidator superGrilleValidator = new SuperGrilleValidator();

    public SuperGrille(int code, float mise, int[] nombresMises, int inNumeroChance) {
        super(code, mise, nombresMises);
        
        setNumeroChance(inNumeroChance);
    }

    private void setNumeroChance(int inNumeroChance) {
        superGrilleValidator.checkNumeroChance(inNumeroChance);
        numeroChance = inNumeroChance;
    }

    public int getNumeroChance() {
        return numeroChance;
    }
}
