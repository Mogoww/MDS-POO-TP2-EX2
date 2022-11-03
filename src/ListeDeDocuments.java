import java.util.ArrayList;
import java.util.Vector;

public class ListeDeDocuments {

    private ArrayList<Document> liste;

    // ajoute un document à la liste avec Vecteur (java.util. Vector).
    public void ajouterDocument(Document doc) {
       Vector<Document> liste = new Vector<Document>();
    }

    // tous les auteurs
    public void tousLesAuteurs() {
        // display number of elements in the list and authors if exists
        if (liste.size() == 0) {
            System.out.println("Il n'y a aucun auteur dans la liste.");
        } else {
            System.out.println("Il y a " + liste.size() + " auteur(s) dans la liste.");
            for (int i = 0; i < liste.size(); i++) {
                System.out.println(liste.get(i).getAuteur());
            }
        }
    }
}
