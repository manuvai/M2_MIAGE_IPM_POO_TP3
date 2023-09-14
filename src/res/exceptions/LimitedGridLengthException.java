package res.exceptions;

import res.tolo.Tolo;

import java.text.MessageFormat;

public class LimitedGridLengthException extends NoStackTraceRuntimeException {
    public LimitedGridLengthException() {
        super(MessageFormat.format(
                "La grille doit contenir {0} numéros",
                Tolo.PERMITTED_NUMBERS));
    }
}
