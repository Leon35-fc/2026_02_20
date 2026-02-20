package fabiocarlino.gestione_eventi.repositories;

import fabiocarlino.gestione_eventi.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UtentiRepo extends JpaRepository<Utente, UUID> {
    Optional<Utente> findById(UUID id);

    Optional<Utente> findByEmail(String email);

    
}
