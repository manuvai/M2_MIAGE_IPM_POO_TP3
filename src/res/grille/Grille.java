package res.grille;

import res.exceptions.InvalidEntryException;
import res.exceptions.InvalidGridOuterBoundException;
import res.exceptions.LimitedGridLengthException;
import res.exceptions.MultipleOccuredNumberException;

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
        if (Objects.isNull(inNombres)) {
            throw new InvalidEntryException();
        }

        checkEntry(inNombres);

        nombres = inNombres;

    }

    private void checkEntry(int[] inNombres) {
        // Contrôle du nombre de numéros fournis
        if (inNombres.length != PERMITTED_NUMBERS) {
            throw new LimitedGridLengthException();
        }

        // Contrôle de l'occurence des numéros
        int[] occurences = new int[Grille.UPPER_BOUND + 1];

        for (int nombre : inNombres) {
            occurences[nombre]++;

            if (occurences[nombre] > 1) {
                throw new MultipleOccuredNumberException();
            }
        }

        // Contrôle de la valeur des numéros
        for (int nombre : inNombres) {
            if (nombre > UPPER_BOUND || nombre < LOWER_BOUND) {
                throw new InvalidGridOuterBoundException();
            }
        }
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
