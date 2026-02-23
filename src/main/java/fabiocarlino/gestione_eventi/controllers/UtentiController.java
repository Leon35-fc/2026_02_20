package fabiocarlino.gestione_eventi.controllers;

import fabiocarlino.gestione_eventi.entities.Utente;
import fabiocarlino.gestione_eventi.exceptions.ValidationException;
import fabiocarlino.gestione_eventi.payloads.UtenteDTO;
import fabiocarlino.gestione_eventi.services.UtentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utenti")
public class UtentiController {
    private final UtentiService utentiService;

    @Autowired
    public UtentiController(UtentiService utentiService) {
        this.utentiService = utentiService;
    }

    //POST UTENTE
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Utente createUtente(@RequestBody @Validated UtenteDTO payload, BindingResult validationResult) {
        if (validationResult.hasErrors()) {

            List<String> errorsList = validationResult.getFieldErrors()
                    .stream()
                    .map(fieldError -> fieldError.getDefaultMessage())
                    .toList();
            validationResult.getAllErrors().forEach(error -> {
                System.out.println(error + " PAREO");
            });
            throw new ValidationException(errorsList);
        } else {
            return this.utentiService.save(payload);
        }
    }

    //GET ALL UTENTI
//    @GetMapping
//    public Page<Utente> findAll(
//            @RequestParam(defaultValue = "0") int page,
//            @RequestParam(defaultValue = "10") int size,
//            @RequestParam(defaultValue = "id") String orderBy,
//            @RequestParam(defaultValue = "asc") String sortCriteria) {
//
//        return this.utentiService.findAll(page, size, orderBy, sortCriteria);
//    }

    @GetMapping
    public List<Utente> findAll() {
        return this.utentiService.findAll();
    }
}
