package fabiocarlino.gestione_eventi.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "utenti")
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idUtente;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cognome;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RuoloUtente tipoUtente;

    public Utente() {
    }

    public Utente(String nome, String cognome, String email, String password, RuoloUtente tipoUtente) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.tipoUtente = tipoUtente;
    }

    public UUID getIdUtente() {
        return idUtente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RuoloUtente getTipoUtente() {
        return tipoUtente;
    }

    public void setTipoUtente(RuoloUtente tipoUtente) {
        this.tipoUtente = tipoUtente;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "idUtente=" + idUtente +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", tipoUtente=" + tipoUtente +
                '}';
    }
}
