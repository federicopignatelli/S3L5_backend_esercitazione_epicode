package federicopignatelli.entities;
import java.time.LocalDate;
import javax.persistence.*;
public class ElaboratoTipografico {
    //ATTRIBUTI
    @Id
    @GeneratedValue
    private Long ISBN;
    public String titolo;
    public LocalDate annoPubblicazione;
    public int numeroPagine;

    //COSTRUTTORI
    public ElaboratoTipografico() {
    }

    public ElaboratoTipografico(String titolo, LocalDate annoPubblicazione, int numeroPagine) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    //METODI GETTER & SETTER

    public Long getISBN() {
        return ISBN;
    }

    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public LocalDate getAnnoPubblicazione() {
        return annoPubblicazione;
    }
    public void setAnnoPubblicazione(LocalDate annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }
    public int getNumeroPagine() {
        return numeroPagine;
    }
}
