import java.util.ArrayList;
import java.util.Vector;

public class ListeDeDocuments {

    private Vector<Document> liste;


    public ListeDeDocuments() {
        this.liste = new Vector<Document>();
    }

    // ajoute un document à la liste avec Vecteur (java.util. Vector).
    public void ajouterDocument(Document doc) {
        this.liste.add(doc);
    }

    // tous les auteurs
    public void tousLesAuteurs() {
        for (Document doc : liste) {
            if (doc instanceof Livre) {
                System.out.println(((Livre) doc).getAuteur());
            }
        }
    }


    // touss les Documents
    public void tousLesDocuments() {
        for (Document doc : liste) {
            System.out.println(doc);
        }
    }


    // toString
    public String toString() {
        return "ListeDeDocuments [liste=" + liste + "]";
    }
}
