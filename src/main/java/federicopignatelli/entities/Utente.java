package federicopignatelli.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Utente {
    private String nome;
    private String cognome;
    private LocalDate datadinascita;
    @Id
    @GeneratedValue
    public long numerotessera;
    @OneToMany(mappedBy = "utente")
    public List<Prestito> prestiti = new ArrayList<>();
}
