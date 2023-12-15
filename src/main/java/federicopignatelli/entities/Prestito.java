package federicopignatelli.entities;

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


}
