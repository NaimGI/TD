package Module;

public class Ecole {
    public String nom;

    private final int MAXETUDIANT=500;

    private int Counter;

    private Etudiant [] tableEtud=new Etudiant[MAXETUDIANT];

    public Ecole() {
    }
    public void ajouteEtudiant(Etudiant etudiant){
        if(Counter<MAXETUDIANT){
            tableEtud[Counter]=etudiant;
            Counter+=1;
        }else{
            System.out.println("le ecole est pleine");
        }
    }

    public int rechechreEtudiant(Etudiant etudiant){
        int index=-1;
        for (int i =0;i<tableEtud.length;i++){
            if(tableEtud[i].equal(etudiant))
        }
    }
}
