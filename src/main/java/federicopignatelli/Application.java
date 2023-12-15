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
//        Rivista Style = new Rivista("StyleMagazine", LocalDate.of(2022, 6, 6), 20, TipoRivista.MENSILE);
//        sd.save(Style);
//        Libro Avventure = new Libro("Le Avventure", "Giovanni", "Azione", LocalDate.of(2021, 8, 20), 276);
//        sd.save(Avventure);

//        Rivista StyleVogue = new Rivista("StyleVogue", LocalDate.of(2018, 2, 2), 77, TipoRivista.SETTIMANALE);
//        sd.save(StyleVogue);
//
//        Libro LogicaUniversità = new Libro("Logica per l'università", "prof. Pitagora", "Accademico", LocalDate.of(2020, 1, 1), 276);
//        sd.save(LogicaUniversità);
//
//        Rivista Automoto = new Rivista("Automoto.it", LocalDate.of(2018, 2, 2 ), 92, TipoRivista.SEMESTRALE);
//        sd.save(Automoto);

//        Libro dacancellare = new Libro("LOL", "LOL", "LOL", LocalDate.of(2020, 1, 1), 20);
//        sd.save(dacancellare);
//        sd.RimuoviISBN(5);

//        System.out.println(sd.TrovaISBN(2));
//        System.out.println(sd.TrovaAutore("Giovanni"));
//        System.out.println(sd.TrovaAnnoPubblicazione(LocalDate.of(2018, 2, 2 )));





        em.close();
        emf.close();
    }

}
