package res.exceptions;

public class MultipleOccuredNumberException extends NoStackTraceRuntimeException {
    public MultipleOccuredNumberException() {
        super("La grille fournie comporte des nombres redondants.");
    }
}
