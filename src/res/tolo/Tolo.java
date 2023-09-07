package res.tolo;

import res.Grille;
import res.mise.MiseTolo;
import res.exceptions.NoStackTraceRuntimeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tolo {
    private Grille numerosGagnants;
    private List<MiseTolo> mises = new ArrayList<>();

    public void ajouterMise(MiseTolo miseTolo) {
        if (Objects.nonNull(miseTolo)) {
            mises.add(miseTolo);
        }
    }

    public int obtenirGain(MiseTolo miseTolo) {

        if (Objects.isNull(numerosGagnants)) {
            throw new NoStackTraceRuntimeException("Aucun tirage effectué");
        }

        int gain = 0;

        if (Objects.nonNull(miseTolo)) {
            Grille numerosChoisis = miseTolo.getNumerosChoisis();
            int correspondingNumbers = numerosGagnants.getCorrespondingNumbers(numerosChoisis);

            gain = getCalculatedGain(miseTolo.getMise(), correspondingNumbers);

        }

        return gain;
    }

    protected int getCalculatedGain(int mise, int correspondingNumbers) {
        int multiplier = 0;

        if (correspondingNumbers == 4) {
            multiplier = 50;

        } else if (correspondingNumbers == 3) {
            multiplier = 5;

        }

        return multiplier * mise;
    }

}
