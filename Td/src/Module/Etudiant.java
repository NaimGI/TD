package Module;

import java.util.Objects;

public abstract class Etudiant {
    protected int Identifiant;
    protected  String nom ;
    protected  String prenom;
    protected  double moyenne;
    public Etudiant(int Identifiant,String nom,String prenom,double moyenne) {
        this.Identifiant=Identifiant;
        this.nom =nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Etudiant) {
            Etudiant etudiant = (Etudiant) obj;
            return this.Identifiant == etudiant.Identifiant;
        }
        return false;
    }

    protected abstract void AjouterUneAbsence();

    @Override
    public String toString() {
        return "Etudiant{" +
                "Identifiant=" + Identifiant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", moyenne=" + moyenne +
                '}';
    }
}
