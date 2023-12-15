package federicopignatelli.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Utente {
    private String nome;
    private String cognome;
    private LocalDate datadinascita;
    public long numerotessera;
    public List<Prestito> prestiti = new ArrayList<>();
}
