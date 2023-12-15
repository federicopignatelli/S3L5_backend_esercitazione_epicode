package federicopignatelli.DAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import federicopignatelli.entities.Utente;



public class UtenteDAO {
    private final EntityManager em;
    public UtenteDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Utente utente) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(utente);
        transaction.commit();
        System.out.println("Operazione di inserimento, Utente numero " + utente.getNumerotessera() + " aggiunto correttamente!");
    }

}
