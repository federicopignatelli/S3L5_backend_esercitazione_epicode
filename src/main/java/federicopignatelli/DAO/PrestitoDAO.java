package federicopignatelli.DAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import federicopignatelli.entities.Prestito;
import federicopignatelli.entities.Utente;

public class PrestitoDAO {
    private final EntityManager em;
    public PrestitoDAO(EntityManager em) {
        this.em = em;
    }
    public void save(Prestito prestito) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(prestito);
        transaction.commit();
        System.out.println("Operazione di inserimento, Prestito numero " + prestito.getIdprestito() + " aggiunto correttamente!");
    }
}
