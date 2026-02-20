package fabiocarlino.gestione_eventi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestioneEventiApplication {

    public static void main(String[] args) {

        SpringApplication.run(GestioneEventiApplication.class, args);

        /* CONTROLLO IL TIPO DELL'UTENTE
        Utente utente = new Utente("Carlo", "Cracco", "carlo.cracco@gmail.com", "password", RuoloUtente.ORGANIZZATORE);
        System.out.println(utente.getTipoUtente().equals(RuoloUtente.UTENTE));
         */

        /* CONTROLLO SULL'EVENTO
        Evento evento = new Evento("Festa in piscina", "porta il costume", LocalDate.parse("2026-02-02"), "Napoli", 30);
        System.out.println(evento.getData().isBefore(LocalDate.now()));
        evento.setPostiDisponibili(-2);

        System.out.println(evento.getPostiDisponibili());

        evento.setOrganizzatore(utente);
         */

    }


}
//Sviluppare un'applicazione web che permetta agli utenti di visualizzare una lista di eventi,
//prenotare posti per partecipare agli eventi disponibili e fornire funzionalità di gestione degli eventi per gli organizzatori.
//Implementare un sistema di registrazione e accesso per gli utenti.
//Definire almeno due ruoli utente: "Utente Normale" e "Organizzatore di Eventi" (Non serve il CRUD completo per gli utenti).
//Le password devono essere protette opportunamente.
// "Organizzatore di Eventi" è il creatore dell'evento, non è un Admin della piattaforma.
// Gli organizzatori possono creare nuovi eventi specificando dettagli come
// titolo, descrizione, data, luogo e numero di posti disponibili, l'evento inoltre deve avere un riferimento al creatore di esso.
// - Gli organizzatori devono anche poter modificare ed eventualmente eliminare i propri eventi
// - Gli utenti possono prenotare posti per partecipare agli eventi che hanno ancora disponibilità
//Ricordarsi di gestire in maniera appropriata eccezioni ed opportune risposte di errore.
// Vietato committare/pushare direttamente su master/main e obbligatorio gestire la repository in maniera accurata (alla fine il lavoro va unito comunque a master/main)
//EXTRA: Gli utenti possono visualizzare gli eventi a cui hanno prenotato un posto e annullare la prenotazione se necessario

