package federicopignatelli.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;
@Entity
public class Rivista extends ElaboratoTipografico{
    @Enumerated(EnumType.STRING)
    @Column(name = "Tipo_di_rivista")
    public TipoRivista tipoRivista;

    public Rivista() {
    }

    public Rivista(String titolo, LocalDate annoPubblicazione, int numeroPagine, TipoRivista tipoRivista) {
        super(titolo, annoPubblicazione, numeroPagine);
        this.tipoRivista = tipoRivista;
    }

    public TipoRivista getTipoRivista() {
        return tipoRivista;
    }

    public void setTipoRivista(TipoRivista tipoRivista) {
        this.tipoRivista = tipoRivista;
    }
}
