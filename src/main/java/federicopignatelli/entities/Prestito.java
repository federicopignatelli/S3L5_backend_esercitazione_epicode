package federicopignatelli.entities;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
public class Prestito {
    @Id
    @GeneratedValue
    public long idprestito;
    @OneToOne
    @JoinColumn
    public ElaboratoTipografico elaboratotipografico;
    @ManyToOne
    @JoinColumn(name = "nTesseraUtente")
    private Utente utente;
    public LocalDate dataInizio;
    public LocalDate dataFine;
    public LocalDate dataRestituzione;
}
