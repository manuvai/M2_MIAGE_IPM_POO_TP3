package res.exceptions;

import res.mise.MiseSuperTolo;

import java.text.MessageFormat;

public class InvalidLuckNumberOuterBoundException extends NoStackTraceRuntimeException {

    public InvalidLuckNumberOuterBoundException() {
        super(MessageFormat.format(
                "Le numéro chance doit être compris entre {0} et {1}",
                MiseSuperTolo.LOWER_LUCK_NUMBER,
                MiseSuperTolo.UPPER_LUCK_NUMBER));
    }
}
