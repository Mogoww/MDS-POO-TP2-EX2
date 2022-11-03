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
        for (Document doc : liste) {
            if (doc instanceof Livre) {
                System.out.println(((Livre) doc).getAuteur());
            }
        }
    }
}
