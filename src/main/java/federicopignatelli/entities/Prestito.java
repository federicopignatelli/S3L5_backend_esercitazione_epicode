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

    public Prestito(ElaboratoTipografico elaboratotipografico, Utente utente, LocalDate dataInizio, LocalDate dataFine, LocalDate dataRestituzione) {
        this.elaboratotipografico = elaboratotipografico;
        this.utente = utente;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.dataRestituzione = dataRestituzione;
    }

    public long getIdprestito() {
        return idprestito;
    }

    public void setIdprestito(long idprestito) {
        this.idprestito = idprestito;
    }

    public ElaboratoTipografico getElaboratotipografico() {
        return elaboratotipografico;
    }

    public void setElaboratotipografico(ElaboratoTipografico elaboratotipografico) {
        this.elaboratotipografico = elaboratotipografico;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    public void setDataFine(LocalDate dataFine) {
        this.dataFine = dataFine;
    }

    public LocalDate getDataRestituzione() {
        return dataRestituzione;
    }

    public void setDataRestituzione(LocalDate dataRestituzione) {
        this.dataRestituzione = dataRestituzione;
    }
}
