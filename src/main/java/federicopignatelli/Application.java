package federicopignatelli;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionebiblioteca");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();


        System.out.println("Hello World!");


        em.close();
        emf.close();
    }

}
