package fabiocarlino.gestione_eventi.payloads;

import fabiocarlino.gestione_eventi.entities.RuoloUtente;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UtenteDTO(
        @NotBlank(message = "Il campo \"nome\" è obbligatorio")
        @Size(min = 3, max = 30, message = "Il campo deve contenere tra i 3 ed i 30 caratteri")
        String nome,
        @NotBlank(message = "Il campo \"nome\" è obbligatorio")
        @Size(min = 3, max = 30, message = "Il campo \"cognome\" deve contenere tra i 3 ed i 30 caratteri")
        String cognome,
        @NotBlank(message = "Il campo \"email\" è obbligatorio")
        @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{3,}$", message = "Formato password non valido")
        String email,
        @NotBlank(message = "Il campo \"password\" è obbligatorio")
//        @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$){2,4}$", message = "La password deve contenere una maiuscola, una minuscola, un numero e deve essere lunga almeno 8 caratteri.")
        @Size(min = 4, max = 32)
        String password,
        @NotNull(message = "Il campo \"ruolo utente\" è obbligatorio")
        RuoloUtente ruoloUtente) {
}
