package fabiocarlino.gestione_eventi.repositories;

import fabiocarlino.gestione_eventi.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PrenotazioniRepo extends JpaRepository<Prenotazione, UUID> {

    Optional<Prenotazione> findById(UUID id);

    Optional<Prenotazione> findByUtente(UUID idUtente);

    Optional<Prenotazione> findByEvento(UUID idEvento);
}
