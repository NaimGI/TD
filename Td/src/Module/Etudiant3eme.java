package Module;

public class Etudiant3eme extends  Etudiant{

    public String Branche;

    public Etudiant3eme(int Identifiant, String nom, String prenom, double moyenne) {
        super(Identifiant, nom, prenom, moyenne);
        this.Branche = Branche;
    }

    @Override
    protected void AjouterUneAbsence() {
     moyenne =moyenne - 0.5f;
    }
}
