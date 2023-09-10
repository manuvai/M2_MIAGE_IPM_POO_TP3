package res.exceptions;

import res.grille.Grille;

import java.text.MessageFormat;

public class InvalidGridOuterBoundException extends NoStackTraceRuntimeException {

    public InvalidGridOuterBoundException() {
        super(MessageFormat.format(
                "La grille contient un ou plusieurs nombres non compris entre {0} et {1}",
                Grille.LOWER_BOUND,
                Grille.UPPER_BOUND));
    }
}
