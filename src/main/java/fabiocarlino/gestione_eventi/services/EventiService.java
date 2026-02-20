package fabiocarlino.gestione_eventi.services;

import fabiocarlino.gestione_eventi.entities.Evento;
import fabiocarlino.gestione_eventi.repositories.EventiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventiService {
    private final EventiRepo eventiRepo;

    @Autowired
    public EventiService(EventiRepo eventiRepo) {
        this.eventiRepo = eventiRepo;
    }

    public Evento save(EventoDTO payload){
        this.eventiRepo.findByData(payload)
    }
}

