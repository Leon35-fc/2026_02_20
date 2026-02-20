package fabiocarlino.gestione_eventi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "prenotazioni")
public class Prenotazioni {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idPrenotazione;

    @Column(nullable = false)
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "id_utente")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "id_evento")
    private Evento evento;

    public Prenotazioni() {
    }

    public Prenotazioni(UUID idPrenotazione, LocalDate data, Utente utente, Evento evento) {
        this.idPrenotazione = idPrenotazione;
        this.data = data;
        this.utente = utente;
        this.evento = evento;
    }

    public Utente getUtente() {
        return utente;
    }

    public UUID getIdPrenotazione() {
        return idPrenotazione;
    }

    public Evento getEvento() {
        return evento;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Prenotazioni{" +
                "idPrenotazione=" + idPrenotazione +
                ", data=" + data +
                ", utente=" + utente +
                ", evento=" + evento +
                '}';
    }
}
