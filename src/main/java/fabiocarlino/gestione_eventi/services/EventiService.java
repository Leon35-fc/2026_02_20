package fabiocarlino.gestione_eventi.services;

import fabiocarlino.gestione_eventi.entities.Evento;
import fabiocarlino.gestione_eventi.payloads.EventoDTO;
import fabiocarlino.gestione_eventi.repositories.EventiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import riccardogulin.u5d12.exceptions.BadRequestException;

@Service
public class EventiService {
    private final EventiRepo eventiRepo;

    @Autowired
    public EventiService(EventiRepo eventiRepo) {
        this.eventiRepo = eventiRepo;
    }

    public Evento save(EventoDTO payload) {
        this.eventiRepo.
                findByData(payload.data())
                .ifPresent(event -> {
                    throw new BadRequestException("L'evento " + event.getTitolo() + " è già presente.");
                });

        Evento newEvento = new Evento(
                payload.titolo(),
                payload.descrizione(),
                payload.data(),
                payload.luogo(),
                payload.postiDisponibili()
        );

        Evento savedEvento = this.eventiRepo.save(newEvento);

        System.out.println("L'evento è stato salvato correttamente. Id: " + savedEvento.getIdEvento());

        return savedEvento;
    }
}

