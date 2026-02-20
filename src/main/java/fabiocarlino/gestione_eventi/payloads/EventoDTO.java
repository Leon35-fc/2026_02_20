package fabiocarlino.gestione_eventi.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record EventoDTO(
        @NotBlank(message = "Il campo \"titolo\" è obbligatorio")
        @Size(min = 8, max = 30, message = "Il campo contiene tra gli 8 e i 30 caratteri")
        String titolo,
        @NotBlank(message = "Il campo \"descrizione\" è obbligatorio")
        @Size(min = 10, max = 30, message = "Il campo contiene tra i 10 e i 30 caratteri")
        String descrizione,
        @NotBlank(message = "Il campo \"data\" è obbligatorio")
        LocalDate data,
        @NotBlank(message = "Il campo \"luogo\" è obbligatorio")
        @Size(min = 3, max = 30, message = "Il campo contiene tra i 3 ed i 30 caratteri")
        String luogo,
        @NotBlank(message = "Il campo \"luogo\" è obbligatorio")
        int postiDisponibili
) {
}
