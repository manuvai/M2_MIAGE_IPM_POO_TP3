package res.validator;

import res.exceptions.InvalidGridOuterBoundException;
import res.exceptions.LimitedGridLengthException;
import res.exceptions.MultipleOccuredNumberException;
import res.tolo.Tolo;

public class GrilleValidator {
    public void checkEntry(int[] inNombres) {
        // Contrôle du nombre de numéros fournis
        if (inNombres.length != Tolo.PERMITTED_NUMBERS) {
            throw new LimitedGridLengthException();
        }

        // Contrôle de la valeur des numéros
        for (int nombre : inNombres) {
            if (nombre > Tolo.UPPER_BOUND || nombre < Tolo.LOWER_BOUND) {
                throw new InvalidGridOuterBoundException();
            }
        }

        // Contrôle de l'occurence des numéros
        int[] occurences = new int[Tolo.UPPER_BOUND + 1];

        for (int nombre : inNombres) {
            occurences[nombre]++;

            if (occurences[nombre] > 1) {
                throw new MultipleOccuredNumberException();
            }
        }
    }
}
