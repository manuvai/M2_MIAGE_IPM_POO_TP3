package res.mise;

import res.Grille;

public class MiseTolo {
    protected int code;
    protected int mise;
    protected Grille numerosChoisis;

    public MiseTolo(int inCode, int inMise, Grille inNumerosChoisis) {
        code = inCode;
        mise = inMise;
        numerosChoisis = inNumerosChoisis;
    }

    public Grille getNumerosChoisis() {
        return numerosChoisis;
    }

    public int getCode() {
        return code;
    }

    public int getMise() {
        return mise;
    }
}
