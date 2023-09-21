package res.tolo;

import res.grille.SuperGrille;
import res.validator.SuperGrilleValidator;
import utils.NumberUtils;

import java.util.Objects;

public class SuperTolo extends Tolo {
    public static final int LOWER_LUCK_NUMBER = 0;
    public static final int UPPER_LUCK_NUMBER = 10;
    private int numeroChance;
    private SuperGrilleValidator superGrilleValidator = new SuperGrilleValidator();

    @Override
    public void effectuerTirage() {
        super.effectuerTirage();

        setNumeroChance(NumberUtils.random(LOWER_LUCK_NUMBER, UPPER_LUCK_NUMBER));
    }

    public void setNumeroChance(int inNumeroChance) {
        superGrilleValidator.checkNumeroChance(inNumeroChance);
        numeroChance = inNumeroChance;
    }

    @Override
    public float obtenirGain(int codeGrille) {
        SuperGrille superGrille = (SuperGrille) rechercherGrilleJouee(codeGrille);

        return Objects.isNull(superGrille)
                ? 0
                : obtenirGain(superGrille);
    }

    public float obtenirGain(SuperGrille grille) {
        float gain = super.obtenirGain(grille);

        int multiplier = (Objects.isNull(grille) || numeroChance != grille.getNumeroChance())
                ? 1
                : 5;

        return gain * multiplier;
    }
}
