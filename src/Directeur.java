import java.time.LocalDate;

class Directeur extends Personne implements DemandeConge, ValidationConge {
    private int nombreEmployes;

    public Directeur(String nom, String prenom, int nombreEmployes) {
        super(nom, prenom);
        this.nombreEmployes = nombreEmployes;
    }

    @Override
    public Conge poserConge(LocalDate dateDebut, LocalDate dateFin) {
        Conge nouveauConge = new Conge(dateDebut, dateFin, this);
        nouveauConge.setStatut(StatutConge.approuve);
        return nouveauConge;
    }

    @Override
    public void validerConge(Conge conge) {
        conge.setStatut(StatutConge.approuve);
        System.out.println("Le congé a été validé par le directeur.");

    }

    @Override
    public void refuserConge(Conge conge) {
        conge.setStatut(StatutConge.refuse);
        System.out.println("Le congé a été refusé par le directeur.");
    }


}
