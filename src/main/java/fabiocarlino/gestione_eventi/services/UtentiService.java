package fabiocarlino.gestione_eventi.services;

import fabiocarlino.gestione_eventi.entities.Utente;
import fabiocarlino.gestione_eventi.payloads.UtenteDTO;
import fabiocarlino.gestione_eventi.repositories.UtentiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import riccardogulin.u5d12.exceptions.BadRequestException;

import java.util.ArrayList;
import java.util.List;

@Service
public class UtentiService {
    private final UtentiRepo utentiRepo;

    private List<Utente> utenteDB = new ArrayList<>();

    @Autowired
    public UtentiService(UtentiRepo utentiRepo) {
        this.utentiRepo = utentiRepo;
    }

    public Utente save(UtenteDTO payload) {

        //CONTROLLO L'EMAIL
        this.utentiRepo.
                findByEmail(payload.email())
                .ifPresent(user -> {
                    throw new BadRequestException("L'email " + user.getEmail() + " è già presente.");
                });

        System.out.println(payload.email());

        //RECUPERO I DATI DELL'UTENTE DAL PAYLOAD
        Utente newUtente = new Utente(
                payload.nome(),
                payload.cognome(),
                payload.email(),
                payload.password(),
                payload.ruoloUtente());


        //SALVO L'UTENTE
        Utente savedUtente = this.utentiRepo.save(newUtente);

        //LOG
        System.out.println("L'utente è stato salvato correttamente. Id: " + savedUtente.getIdUtente());

        //TORNO L'UTENTE
        return savedUtente;
    }

    public Page<Utente> findAll(int page, int size, String orderBy, String sortCriteria) {
        if (size > 100 || size < 0) size = 10;
        if (page < 0) page = 0;

        Pageable pageable = PageRequest.of(
                page,
                size,
                sortCriteria.equals("desc") ? Sort.by(orderBy).descending() : Sort.by(orderBy));
        return this.utentiRepo.findAll(pageable);
    }

    public List<Utente> findAll() {
        return this.utenteDB;
    }

}
