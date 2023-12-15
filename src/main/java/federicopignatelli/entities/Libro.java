package federicopignatelli.entities;

import java.time.LocalDate;

public class Libro extends ElaboratoTipografico{
    public String autore;
    public String genere;

    public Libro() {
    }

    public Libro(String titolo, String autore, String genere, LocalDate annoPubblicazione, int numeroPagine) {
        super(titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
