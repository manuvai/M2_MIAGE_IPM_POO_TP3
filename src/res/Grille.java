package res;

import res.exceptions.InvalidGridOuterBoundException;
import res.exceptions.LimitedGridLengthException;

import java.util.Objects;

public class Grille {

    public static final int LOWER_BOUND = 1;

    public static final int UPPER_BOUND = 20;
    public static final int PERMITTED_NUMBERS = 4;

    private int[] nombres;

    public Grille(int[] inNombres) {
        setNombres(inNombres);
    }

    public void setNombres(int[] inNombres) {

        if (inNombres.length != PERMITTED_NUMBERS) {
            throw new LimitedGridLengthException();
        }

        for (int nombre : inNombres) {
            if (nombre > UPPER_BOUND || nombre < LOWER_BOUND) {
                throw new InvalidGridOuterBoundException();
            }
        }

        nombres = inNombres;

    }

    public int getCorrespondingNumbers(Grille grilleComparable) {
        int correspondingNumbers = 0;

        if (Objects.nonNull(grilleComparable)) {
            for (int numero : nombres) {
                for (int numeroComparable : grilleComparable.getNombres()) {
                    if (numero == numeroComparable) {
                        correspondingNumbers++;
                    }
                }
            }
        }

        return correspondingNumbers;
    }

    public int[] getNombres() {
        return nombres;
    }
}
