package fabiocarlino.gestione_eventi;

import fabiocarlino.gestione_eventi.repositories.UtentiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtentiService {

    private final UtentiRepo utentiRepo;

    @Autowired
    public UtentiService(UtentiRepo utentiRepo) {
        this.utentiRepo = utentiRepo;
    }
    
}
