package fabiocarlino.gestione_eventi.repositories;

import fabiocarlino.gestione_eventi.entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface EventiRepo extends JpaRepository<Evento, UUID> {

    Optional<Evento> findById(UUID id);

    Optional<Evento> findByData(LocalDate date);

    Optional<Evento> findByLuogo(String citta);
}
