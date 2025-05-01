import java.time.LocalDate;

public class Conge {
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private StatutConge statut;
    private Personne demandeur;

    public Conge(LocalDate dateDebut, LocalDate dateFin, Personne demandeur) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.statut = StatutConge.en_attente;
        this.demandeur = demandeur;
    }


    public void setStatut(StatutConge statut) {
        this.statut = statut;
    }

    public StatutConge getStatut() {
        return statut;
    }


    public String getDetails() {
        return "Congé de " + demandeur.getPrenom() + " " + demandeur.getNom() +
                " du " + dateDebut + " au " + dateFin +
                " | Statut : " + statut;
    }
}

