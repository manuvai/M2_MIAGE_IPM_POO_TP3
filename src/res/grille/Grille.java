package res.grille;

import res.exceptions.InvalidEntryException;
import res.validator.GrilleValidator;

import java.util.Objects;

public class Grille {
    protected int code;
    protected float mise;
    protected int[] nombresMises;

    private GrilleValidator grilleValidator = new GrilleValidator();

    public Grille(int code, float mise, int[] nombresMises) {
        this.code = code;
        this.mise = mise;
        setNombresMises(nombresMises);
    }

    private void setNombresMises(int[] inNombresMises) {
        if (Objects.isNull(inNombresMises)) {
            throw new InvalidEntryException();
        }

        grilleValidator.checkEntry(inNombresMises);
        nombresMises = inNombresMises;
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
