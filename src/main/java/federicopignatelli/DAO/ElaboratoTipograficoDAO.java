package federicopignatelli.DAO;
import federicopignatelli.entities.ElaboratoTipografico;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

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
}
