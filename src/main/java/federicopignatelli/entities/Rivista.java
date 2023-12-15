package federicopignatelli.entities;

import javax.persistence.Entity;
import java.time.LocalDate;
@Entity
public class Rivista extends ElaboratoTipografico{
    public TipoRivista tipoRivista;
    public String genere;

    public Rivista() {
    }

    public Rivista(String titolo, String genere, LocalDate annoPubblicazione, int numeroPagine, TipoRivista tipoRivista) {
        super(titolo, annoPubblicazione, numeroPagine);
        this.tipoRivista = tipoRivista;
    }

    public TipoRivista getTipoRivista() {
        return tipoRivista;
    }

    public void setTipoRivista(TipoRivista tipoRivista) {
        this.tipoRivista = tipoRivista;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
