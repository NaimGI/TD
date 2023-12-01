package Module;

public class EtudiantAlternance extends Etudiant {
      public int Salaire;
    public EtudiantAlternance(int Identifiant, String nom, String prenom, double moyenne) {
        super(Identifiant, nom, prenom, moyenne);
    }

    @Override
    protected void AjouterUneAbsence() {
        Salaire = Salaire - 50;
    }

    @Override
    public String toString() {
        return "EtudiantAlternance{" +
                "Salaire=" + Salaire +
                '}';
    }

}
