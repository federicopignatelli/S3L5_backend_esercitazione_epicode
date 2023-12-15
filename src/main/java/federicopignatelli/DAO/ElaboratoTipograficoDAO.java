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
}
