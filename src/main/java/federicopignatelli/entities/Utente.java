package federicopignatelli.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Utente {
    private String nome;
    private String cognome;
    private LocalDate datadinascita;
    @Id
    @GeneratedValue
    public long numerotessera;
    @OneToMany(mappedBy = "utente")
    public List<Prestito> prestiti = new ArrayList<>();

    public Utente() {
    }
    public Utente(String nome, String cognome, LocalDate datadinascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.datadinascita = datadinascita;
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

    public LocalDate getDatadinascita() {
        return datadinascita;
    }

    public void setDatadinascita(LocalDate datadinascita) {
        this.datadinascita = datadinascita;
    }

    public long getNumerotessera() {
        return numerotessera;
    }

    public void setNumerotessera(long numerotessera) {
        this.numerotessera = numerotessera;
    }

    public List<Prestito> getPrestiti() {
        return prestiti;
    }


}
