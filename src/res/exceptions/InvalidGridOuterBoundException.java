package res.exceptions;

import res.tolo.Tolo;

import java.text.MessageFormat;

public class InvalidGridOuterBoundException extends NoStackTraceRuntimeException {

    public InvalidGridOuterBoundException() {
        super(MessageFormat.format(
                "La res.grille contient un ou plusieurs nombres non compris entre {0} et {1}",
                Tolo.LOWER_BOUND,
                Tolo.UPPER_BOUND));
    }
}
