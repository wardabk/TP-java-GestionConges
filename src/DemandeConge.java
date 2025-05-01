import java.time.LocalDate;

public interface DemandeConge {
    Conge poserConge(LocalDate dateDebut, LocalDate dateFin);
}
