package federicopignatelli.DAO;
import federicopignatelli.entities.ElaboratoTipografico;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;

public class ElaboratoTipograficoDAO {
    private final EntityManager em;
    public ElaboratoTipograficoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(ElaboratoTipografico elaboratotipografico) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(elaboratotipografico);
        transaction.commit();
        System.out.println("Operazione di inserimento, elaborato numero " + elaboratotipografico.getISBN() + " aggiunto correttamente!");
    }

    public void RimuoviISBN(long ISBN) {
        ElaboratoTipografico found = em.find(ElaboratoTipografico.class, ISBN);

        if (found != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("L'elaborato è stato cancellato correttamente");
        } else {
            System.err.println("L'elaborato con l'ISBN " + ISBN + " non è stato trovato");
        }
    }

    public ElaboratoTipografico TrovaISBN(long ISBN) {
        return em.find(ElaboratoTipografico.class, ISBN);
    }

//    public ElaboratoTipografico TrovaAutore(String autore) {
//        return em.find(ElaboratoTipografico.class, autore);
//    }

    public List<ElaboratoTipografico> TrovaAutore(String autore) {
        TypedQuery<ElaboratoTipografico> TrovaconAutore = em.createNamedQuery("TrovaAutore", ElaboratoTipografico.class);
        TrovaconAutore.setParameter("autore", autore);
        return TrovaconAutore.getResultList();
    }

    public List<ElaboratoTipografico> TrovaAnnoPubblicazione(LocalDate annoPubblicazione) {
        TypedQuery<ElaboratoTipografico> TrovaconAnno = em.createNamedQuery("TrovaAnnoPubblicazione", ElaboratoTipografico.class);
        TrovaconAnno.setParameter("annoPubblicazione", annoPubblicazione);
        return TrovaconAnno.getResultList();
    }
}
