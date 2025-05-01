import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
class Employe extends Personne implements DemandeConge {
    private List<Conge> listeConges = new ArrayList<>();

    public Employe(String nom, String prenom) {
        super(nom, prenom);
    }

    public List<Conge> getConges() {
        return listeConges;
    }

    @Override
    public Conge poserConge(LocalDate dateDebut, LocalDate dateFin) {
        Conge nouveauConge = new Conge(dateDebut, dateFin, this);
        listeConges.add(nouveauConge);
        return nouveauConge;
    }


}
