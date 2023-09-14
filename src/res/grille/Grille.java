package res.grille;

import res.exceptions.InvalidEntryException;
import res.exceptions.InvalidGridOuterBoundException;
import res.exceptions.LimitedGridLengthException;
import res.exceptions.MultipleOccuredNumberException;
import res.tolo.Tolo;

import java.util.Objects;

public class Grille {
    protected int code;
    protected float mise;
    protected int[] nombresMises;

    public Grille(int code, float mise, int[] nombresMises) {
        this.code = code;
        this.mise = mise;
        setNombresMises(nombresMises);
    }

    private void setNombresMises(int[] inNombresMises) {
        if (Objects.isNull(inNombresMises)) {
            throw new InvalidEntryException();
        }

        checkEntry(inNombresMises);
        nombresMises = inNombresMises;
    }

    private void checkEntry(int[] inNombres) {
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

    public float getMise() {
        return mise;
    }

    public int[] getNombresMises() {
        return nombresMises;
    }

    public int getCode() {
        return code;
    }
}
