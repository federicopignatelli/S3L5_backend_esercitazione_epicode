package federicopignatelli;
import federicopignatelli.DAO.ElaboratoTipograficoDAO;
import federicopignatelli.entities.Libro;
import federicopignatelli.entities.Rivista;
import federicopignatelli.entities.TipoRivista;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionebiblioteca");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        System.out.println("Hello World!");

        ElaboratoTipograficoDAO sd = new ElaboratoTipograficoDAO(em);
        Rivista Style = new Rivista("StyleMagazine", LocalDate.of(2022, 6, 6), 20, TipoRivista.MENSILE);
        sd.save(Style);
        Libro Avventure = new Libro("Le Avventure", "Giovanni", "Azione", LocalDate.of(2021, 8, 20), 276);
        sd.save(Avventure);

        em.close();
        emf.close();
    }

}
