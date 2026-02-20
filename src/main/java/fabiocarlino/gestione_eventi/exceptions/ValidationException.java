package fabiocarlino.gestione_eventi.exceptions;

import java.util.List;

public class ValidationException extends RuntimeException {
    private List<String> errorsMessages;

    public ValidationException(List<String> errorsMessages) {

        super("Ci sono stati errori nel payload");
        this.errorsMessages = errorsMessages;
    }

    public List<String> getErrorsMessages() {
        return errorsMessages;
    }
}