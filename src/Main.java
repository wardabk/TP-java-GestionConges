import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employe emp1 = new Employe("Boubaker", "Warda");
        Employe emp2 = new Employe("Ben Salah", "Ali");
        Directeur dir = new Directeur("Sahraoui", "Zied", 10);

        System.out.println("===== DEMANDES DE CONGÉS =====");

        // Employé 1 demande un congé
        Conge congeEmp1 = emp1.poserConge(LocalDate.of(2025, 5, 1), LocalDate.of(2025, 5, 10));
        System.out.println("Demande : " + congeEmp1.getDetails());

        // Employé 2 demande un congé
        Conge congeEmp2 = emp2.poserConge(LocalDate.of(2025, 7, 15), LocalDate.of(2025, 7, 17));
        System.out.println("Demande : " + congeEmp2.getDetails());

        System.out.println("\n===== VALIDATION DES CONGÉS PAR LE DIRECTEUR =====");

        // Le directeur valide le congé du premier employé
        dir.validerConge(congeEmp1);
        System.out.println("Après validation : " + congeEmp1.getDetails());

        // Le directeur refuse le congé du second employé
        dir.refuserConge(congeEmp2);
        System.out.println("Après refus : " + congeEmp2.getDetails());

        System.out.println("\n===== CONGÉ DU DIRECTEUR =====");

        // Le directeur pose son propre congé (auto-validé)
        Conge congeDir = dir.poserConge(LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 15));
        System.out.println("Demande : " + congeDir.getDetails());


    }



}
